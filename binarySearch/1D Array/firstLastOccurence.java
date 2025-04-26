public class firstLastOccurence {

    static int[] firstAndLastOccurence(int[] nums, int x){

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

        return new int[] {i,j};
    }
    public static void main(String[] args) {
        
        int[] nums = {2,3,5,8,8,8,11,14};
        int x = 8;

        int[] result = firstAndLastOccurence(nums, x);

        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
