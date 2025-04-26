public class minInRotatedArray {

    static int minElementInRotatedSortedArray(int[] nums){

        int low = 0, high = nums.length-1;
        int minimum = Integer.MAX_VALUE;

        while(low <= high){

            int mid = low + (high-low) / 2;

            // if array has no rotation (sorted)
            if(nums[low] <= nums[high]){
                return nums[low];
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] < minimum) minimum = nums[low];
                low = mid+1;
            }
            else{
                if(nums[mid] < minimum) minimum = nums[mid];
                high = mid-1;
            }
        }

        return minimum;
    }
    public static void main(String[] args){

        int[] nums = {4,5,1,2,3};

        System.out.println(minElementInRotatedSortedArray(nums));
    }
}
