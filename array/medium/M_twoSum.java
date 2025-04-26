import java.util.HashMap;

public class M_twoSum {

    static int[] twoSum(int[] nums, int target){

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement))
                return new int[] { map.get(complement), i };

            map.put(nums[i], i);
        }

        return new int[0];
    }
	public static void main(String[] args) {
        
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] index = twoSum(nums, target);
        
        System.out.print(target+ " can be added using index : ");
        for(int num : index){
            System.out.print(num+" ");
        }
    }
}
