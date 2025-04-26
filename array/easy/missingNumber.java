public class missingNumber{

    static int missingElement(int[] nums, int k){

        int n = nums.length;

        int sum = (k*(k+1))/2;
        int arrSum = 0;

        for (int i = 0; i < n; i++) {
            arrSum += nums[i];
        }

        return sum - arrSum;

    }

    static int missingUsingXOR(int[] nums, int k){

        int n = nums.length;

        int XOR = 0;
        
        for(int i=0; i<n; i++){
            XOR^=nums[i];
        }

        for (int i = 1; i <= k; i++) {
            XOR ^= i;
        }

        return XOR;
    }
    public static void main(String[] args){

        int[] nums = {1,2,4,0,5};
        int k = 5;

        System.out.println(missingElement(nums, k));
        System.out.println(missingUsingXOR(nums, k));
    }
}
