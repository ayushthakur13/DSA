public class M_nextPermutation{

    static int[] nextPermutation(int[] nums){

        int n = nums.length;
        int pivot = -1;

        for(int i=n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){

                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            int low=0, high=n-1;
            reverse(nums, low, high);
            return nums;
        }
           

        for(int i=n-1; i>pivot; i--){
            if(nums[i] > nums[pivot]){

                int temp = nums[i];
                nums[i] = nums[pivot];
                nums[pivot] = temp;

                break;
            }
        }
        
        int low = pivot+1, high = n-1;
        reverse(nums, low, high);

        return nums;
    }

    static void reverse(int[] arr, int low, int high){
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }
    public static void main(String[] args){

        int[] nums = {2, 1, 5, 4, 3, 0, 0};

        int[] result = nextPermutation(nums);

        for(int i : result){
            System.out.print(i + " ");
        }
    }
}
