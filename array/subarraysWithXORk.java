import java.util.HashMap;
import java.util.Map;

public class subarraysWithXORk {

    static int numberOfSubarraysWithXORk(int[] nums, int k){

        Map<Integer, Integer> map = new HashMap<>();

        int XOR = 0, count = 0;
        map.put(XOR,1);

        for (int i = 0; i < nums.length; i++) {

            XOR ^= nums[i];
            int x = XOR ^ k;

            if(map.containsKey(x)) 
                count += map.get(x);
            
            if (map.containsKey(XOR)) 
                map.put(XOR, map.getOrDefault(XOR, 0) + 1);
        }

        return count;
    }
    public static void main(String[] args) {
        
        int[] nums = {4, 2, 2, 6, 4};
        int k = 6;

        System.out.println(numberOfSubarraysWithXORk(nums, k));
    }
}
