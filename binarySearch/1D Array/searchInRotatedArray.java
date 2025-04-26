// Array will be sorted and will be rotated at any index.

public class searchInRotatedArray {

    static int searchInRotatedSortedArray(int[] nums, int target) {

        int low = 0, high = nums.length-1;

        while(low <= high) {

            int mid = low + (high-low) / 2;

            if(nums[mid] == target) return mid;

            //left sorted
            else if(nums[low] <= nums[mid]) {

                if(nums[low] <= target && target <= nums[mid])
                    high = mid-1;
                else 
                    low = mid+1;
            }

            //right sorted
            else {

                if(nums[high] >= target && target >= nums[mid])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }

        return -1;
    }

    static boolean searchInRotatedSortedArray_NonUniqueElements(int[] nums, int target) {

        int low = 0, high = nums.length-1;

        while(low <= high) {

            int mid = low + (high-low) / 2;

            if(nums[mid] == target) return true;

            if(nums[low] == nums[mid] && nums[low] == nums[high]){
                low++;
                high--;
                continue;
            }

            //left sorted
            if(nums[low] <= nums[mid]) {

                if(nums[low] <= target && target <= nums[mid])
                    high = mid-1;
                else 
                    low = mid+1;
            }

            //right sorted
            else {

                if(nums[high] >= target && target >= nums[mid])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }

        return false;
    }
    public static void main(String[] args) {

        int[] nums = {7,8,9,1,2,3,4,5,6}; // unique elements
        int target = 1;

        System.out.println(searchInRotatedSortedArray(nums, target));

        int[] nums2 = {3,1,2,3,3,3,3};
        int target2 = 3;

        System.out.println(searchInRotatedSortedArray_NonUniqueElements(nums2, target2));
    }
}
