import java.util.HashMap;
import java.util.Map;

public class longestSubarraySumZero{

    static int longestSubarrayWithSumZero(int[] nums){

        int sum = 0, maxLen = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];

            if(sum == 0)
                maxLen = i+1;
            
            if(map.containsKey(sum)) 
                maxLen = Math.max(maxLen, i-map.get(sum));
            else
                map.put(sum, i);
        }

        return maxLen;
    }
    public static void main(String[] args){

        int[] nums = {1,-1,3,2,-2,-8,1,7,10};

        System.out.println("Length of longest subarray with sum 0 = " + longestSubarrayWithSumZero(nums));
    }
}
