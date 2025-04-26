import java.util.HashMap;
import java.util.Map;

public class M_subarraySumEqualsK{

    static int subarraySumEqualsK(int[] nums, int k){

        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>(); 
         
        map.put(0, 1);
        int prefixSum = 0, count = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += nums[i];

            if(map.containsKey(prefixSum-k))
                count+=map.get(prefixSum-k);

            map.put(prefixSum, map.getOrDefault(prefixSum, 0)+1);
        }

        return count;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,-3,1,1,1,4,2,-3};
        int k = 3;
        
        System.out.println(subarraySumEqualsK(nums, k));
    }
}
