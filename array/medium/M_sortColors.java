// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
public class M_sortColors{

    static void sortColours(int[] nums) {

        int low = 0, mid = 0, high = nums.length-1;

        while(mid<=high){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;

                low++;
                mid++;
            }
            else if(nums[mid] == 1) mid++;
            
            else{
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
    public static void main(String[] args) {
        
        int[] nums = {2,0,2,1,1,0};

        sortColours(nums);

        for(int i : nums){
            System.out.print(i+" ");
        }
    }
}
