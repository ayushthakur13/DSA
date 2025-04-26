public class peakElement {

    static int findPeakElement(int[] nums){

        int n = nums.length;

        if(n == 1) return 0;
        if(nums[0] > nums[1]) return 0;
        if(nums[n-1] > nums[n-2]) return n-1;
        
        int low = 1, high = n-2;

        while (low <= high) {
            
            int mid = low + (high-low) / 2;

            // Check if mid is the peak
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) 
                return mid;

            // If slope is rising, move right
            else if(nums[mid] < nums[mid+1]) 
                low = mid + 1;

            // If slope is falling, move left
            else 
                high = mid - 1;

        }

        return -1;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1};

        System.out.println(findPeakElement(nums));
    }
}
