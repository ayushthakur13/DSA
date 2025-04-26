import java.util.HashMap;

public class longestSubarray {

    static int longestSubPositives(int[] nums, int k) {

        int n = nums.length;
        int left = 0, right = 0, sum = 0, maxLength = 0;
    
        while (right < n) {
            sum += nums[right];
    
            while (sum > k) { 
                sum -= nums[left];
                left++;
            }
    
            if (sum == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
    
            right++;
        }
        return maxLength;
    }

    static int longestSubPosAndNeg(int[] nums, int k){

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, maxLength = 0;
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLength = i + 1;
            }
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                if (len > maxLength) {
                    maxLength = len;
                }
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return maxLength;
    }
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1,1,1,4,2,3};
        int k = 3;

        System.out.println(longestSubPositives(nums, k));

        int[] nums2 = {10, 5, -5, 2, -2, 7, -7, 3};
        int k2 = 5;
        
        System.out.println(longestSubPosAndNeg(nums2, k2));
    }
}
