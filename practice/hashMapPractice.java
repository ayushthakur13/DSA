import java.util.HashMap;
import java.util.Map;

public class hashMapPractice {

    static int firstNonRepeatingCharacter(String s){

        Map<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        for(char c : s.toCharArray()){
            if(map.get(c) == 1) return i;
            i++;
        }

        return -1;
    }

    static int mostFreqElement(int[] nums){
        
        Map<Integer, Integer> map = new HashMap<>();

        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int maxElement = 0, maxFreq = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() > maxFreq){
                maxFreq = e.getValue();
                maxElement = e.getKey();
            }
        }

        return maxElement;
    }

    static int[] twoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            int compliment = target - nums[i];

            if(map.containsKey(compliment)){
                return new int[] {map.get(compliment), i};
            }
            map.put(nums[i], i);
        }

        return new int[0];

    }

    
    public static void main(String[] args){

        String s1 = "leetcode";
        String s2 = "loveleetcode";

        System.out.println(firstNonRepeatingCharacter(s1));
        System.out.println(firstNonRepeatingCharacter(s2));

        int[] arr1 = {1, 3, 2, 3, 4, 3, 2, 2, 2};

        System.out.println(mostFreqElement(arr1));

        int[] arr2 = {2, 7, 11, 15};
        int target = 9;

        int[] twoSum =  twoSum(arr2, target);

        for(int i : twoSum){
            System.out.print(i+" ");
        }


    }
}
