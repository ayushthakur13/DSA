public class singleNumber {

    static int singleNumberInArray(int[] nums){

        int n = nums.length;
        int XOR = 0;

        for(int i=0; i<n; i++){
            XOR^=nums[i];
        }

        return XOR;
    }
    public static void main(String[] args) {
        
        int[] nums = {1,1,2,2,3,4,4};

        System.out.println(singleNumberInArray(nums));
    }
}
