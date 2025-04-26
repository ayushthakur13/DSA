import java.util.List;
import java.util.ArrayList;

public class majorityElementNBy3 {

    static List<Integer> majorityElement(int[] nums){

        List<Integer> result = new ArrayList<>();

        int n = nums.length;
        int el_1 = Integer.MIN_VALUE, el_2 = Integer.MIN_VALUE;
        int cnt_1 = 0, cnt_2 = 0;

        for(int i : nums){

            if(el_1 == i  && i != el_2) cnt_1++;

            else if(el_2 == i  && i != el_1) cnt_2++;
            
            else if(cnt_1 == 0){
                cnt_1 = 1;
                el_1 = i;
            }
            else if(cnt_2 == 0){
                cnt_2 = 1;
                el_2 = i;
            }
            else{
                cnt_1--;
                cnt_2--;
            }
        }

        cnt_1 = 0;
        cnt_2 = 0;
        
        for(int i : nums){
            if(i == el_1) cnt_1++;
            else if(i == el_2) cnt_2++;
        }

        if(cnt_1 > n/3) result.add(el_1);
        if(cnt_2 > n/3) result.add(el_2);

        return result;
    }
    public static void main(String[] args) {
        
        int[] nums = {2,1,1,3,1,4,5,6};

        List<Integer> list = majorityElement(nums);

        for(int i : list){
            System.out.print(i+" ");
        }
    }    
}
