import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum{

    static List<List<Integer>> four_Sum(int[] nums, int target){

        Arrays.sort(nums);

        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();

        for(int i=0; i<n; i++){

            if(i>0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1; j<n; j++){

                if(j>i+1 && nums[j] == nums[j-1]) continue;

                int k = j+1;
                int l = n-1;

                while(k<l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum > target) l--;
                    
                    else if(sum < target) k++;

                    else{
                        list.add(Arrays.asList(nums[i], nums[j], nums[k], nums[l]));

                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                }
            }
        }

        return list; 
    }
    public static void main(String[] args){

        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;

        List<List<Integer>> list = four_Sum(nums, target);

        for(List<Integer> temp : list){
            System.out.print("[ ");
            for(int i : temp){
                System.out.print(i+" ");
            }
            System.out.println("]");
        }
    }
}
