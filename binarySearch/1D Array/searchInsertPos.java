//Given a sorted array of distinct integers and a target value, 
//return the index if the target is found. 
//If not, return the index where it would be if it were inserted in order.

public class searchInsertPos {

    static int lowerBound(int[] nums, int x){

        int low = 0, high = nums.length-1;
        int lb = nums.length;

        while(low <= high){

            int mid = low + (high-low) / 2;

            if(nums[mid] >= x){
                lb = mid;
                high = mid-1;
            }
            else low = mid+1;
        }

        return lb;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,5,6};
        int target = 4;

        System.out.println(lowerBound(nums, target));
    }
}
