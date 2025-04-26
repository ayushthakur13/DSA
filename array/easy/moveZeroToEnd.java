public class moveZeroToEnd{

    static int[] moveZeroes(int[] nums){

        int n = nums.length;
        int j = 0;

        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        } 

        return nums;
    }
    public static void main(String[] args) {
           
        int[] arr = {1,0,2,3,2,0,0,4,5,1};
        
        moveZeroes(arr);

        for(int i : arr){
            System.out.print(i);
        }
    }
}
