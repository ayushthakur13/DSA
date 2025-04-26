public class timesArrayRotated {

    static int howManyTimesArrayRotated(int[] nums){

        int low = 0, high = nums.length-1;
        int minimum = Integer.MAX_VALUE;
        int minIndex = -1;

        while(low <= high){

            int mid = low + (high-low) / 2;

            if(nums[low] <= nums[high]){
                return low;
            }

            if(nums[low] <= nums[mid]){
                if(nums[low] < minimum){
                    minimum = nums[low];
                    minIndex = low;
                }
                low = mid+1;
            }
            else{
                if(nums[mid] < minimum){
                    minimum = nums[mid];
                    minIndex = mid;
                }
                high = mid-1;
            }
        }

        return minIndex;
    }
    public static void main(String[] args) {
        
        int[] nums = {3,4,5,1,2};

        System.out.println(howManyTimesArrayRotated(nums));
    }
}
