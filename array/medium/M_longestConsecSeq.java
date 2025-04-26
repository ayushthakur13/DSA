// Longest Consecutive Sequence
import java.util.HashSet;
import java.util.Set;

public class M_longestConsecSeq {

    static int longestConsecSeq(int[] nums){

        int longest = 1;

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        for (int i : set) {
            if(!set.contains(i - 1)){
                int count = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    x++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
    public static void main(String[] args) {

        int[] nums = {102, 4, 101, 1, 100, 3, 2, 1, 1};

        System.out.println(longestConsecSeq(nums));
    }
}
