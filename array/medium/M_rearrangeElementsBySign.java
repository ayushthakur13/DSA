import java.util.ArrayList;
import java.util.List;

public class M_rearrangeElementsBySign {

    // Variety 1 - if no. of +ve are same as -ve
    static int[] rearrangeElements(int[] nums){

        int n = nums.length;

        int[] result = new int[n];
        int posIndex=0, negIndex=1;

        for(int i = 0; i < n; i++){
        
            if(nums[i] > 0){
                result[posIndex] = nums[i];
                posIndex+=2;
            }   
            else{
                result[negIndex] = nums[i];
                negIndex+=2;
            }  
        }

        return result;
    }

    // Variety 2 - if no. of +ve are not same as -ve
    static int[] rearrangeElements2(int[] nums){

        int n = nums.length;

        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) 
                pos.add(nums[i]);
            else 
                neg.add(nums[i]);
        }

        int posSize = pos.size();
        int negSize = neg.size();
        int k = 0;

        int minSize = Math.min(posSize, negSize);
        for (int i = 0; i < minSize; i++) {
            nums[k++] = pos.get(i);
            nums[k++] = neg.get(i);
        }

        for (int i = minSize; i < posSize; i++) {
            nums[k++] = pos.get(i);
        }

        for (int i = minSize; i < negSize; i++) {
            nums[k++] = neg.get(i);
        }

        return nums;
    }
    public static void main(String[] args) {
        
        // Variety 1 - if no. of +ve are same as -ve
        int[] nums1 = {3,1,-2,-5,2,-4};

        int[] result = rearrangeElements(nums1);

        for(int i : result){
            System.out.print(i + " ");
        }

        System.out.println();

        // Variety 2 - if no. of +ve are not same as -ve
        int[] nums2 = {1, 2, -4, -5, 3, 6};

        int[] result2 = rearrangeElements2(nums2);

        for(int i : result2){
            System.out.print(i + " ");
        }
    }
}
