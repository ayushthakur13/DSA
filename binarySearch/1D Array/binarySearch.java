public class binarySearch{

    static int binarySearch_Iterative(int[] nums, int target){

        int low = 0, high = nums.length-1;

        while(low <= high){

            int mid = low + (high - low) / 2;

            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) high = mid - 1;
            else low = mid + 1;
        }

        return -1;
    }

    static int binarySearch_Recursive (int[] nums, int target, int low, int high){

        if(low > high) return -1;

        int mid = low + (high - low) / 2;

        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return binarySearch_Recursive(nums, target, low, mid-1);
        else return binarySearch_Recursive(nums, target, mid+1, high);
    }
    public static void main(String[] args){

        int[] nums = {3,4,6,7,9,12,15,18};
        int target = 6;

        System.out.println(binarySearch_Iterative(nums, target));

        int target2 = 15;
        int low = 0, high = nums.length-1;

        System.out.println(binarySearch_Recursive(nums, target2, low, high));
    }
}
