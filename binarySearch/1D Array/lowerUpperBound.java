public class lowerUpperBound {

    static int lowerBound(int[] nums, int x){

        int low = 0, high = nums.length-1;
        int lb = nums.length; //hypothetical answer if the value is not present in array

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

    static int upperBound(int[] nums, int x){
        
        int low = 0, high = nums.length-1;
        int ub = nums.length; //hypothetical answer if the value is not present in array

        while(low <= high){

            int mid = low + (high-low) / 2;

            if(nums[mid] > x){
                ub = mid;
                high = mid-1;
            }
            else low = mid+1;
        }

        return ub;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,3,7,8,9,9,11};
        int x = 6;

        System.out.println(lowerBound(nums, x));

        int y = 9;

        System.out.println(upperBound(nums, y));
    }
}
