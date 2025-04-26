public class countNumOfOccurence {

    static int countNumberOfOccurence(int[] nums, int x){
        
        int low = 0, high = nums.length-1;
        int i = -1, j = -1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] == x){
                i = mid;
                high = mid-1;
            }
            else if(nums[mid] > x) high = mid-1;
            else low = mid+1;
        }

        low = 0;
        high = nums.length-1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] == x){
                j = mid;
                low = mid+1;
            }
            else if(nums[mid] < x) low = mid+1;
            else high = mid-1;
        }

        if(i == -1) return 0;
        return (j-i) + 1;
    }
    public static void main(String[] args) {
        
        int[] nums = {1, 1, 2, 2, 2, 2, 3};
        int target = 3;

        System.out.println(countNumberOfOccurence(nums, target));
    }
}
