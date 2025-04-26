import java.util.ArrayList;
import java.util.List;

public class floorAndCeil{

    static List<Integer> floorAndCeilValue(int[] nums, int x) {
        List<Integer> list = new ArrayList<>();
    
        int low = 0, high = nums.length - 1;
        int floor = -1, ceil = -1;
    
        while (low <= high) {
            int mid = low + (high - low) / 2;
    
            if (nums[mid] == x) {
                floor = ceil = nums[mid]; 
                break;
            }
            else if (nums[mid] < x) {
                floor = nums[mid]; 
                low = mid + 1;
            }
            else {
                ceil = nums[mid]; 
                high = mid - 1;
            }
        }
    
        list.add(floor);
        list.add(ceil);

        return list;
    }
    
    public static void main(String[] args) {
        
        int[] nums = {10,20,30,40,50};
        int x = 25;

        List<Integer> list = floorAndCeilValue(nums, x);

        for(int i : list){
            System.out.print(i+" ");
        }
    }
}
