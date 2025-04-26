public class M_kadanesAlgo {

    static int maxSubArray(int[] nums){

        int n = nums.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum+=nums[i];
            
            if(sum>maxSum)
                maxSum = sum;
            
            if(sum<0)
                sum = 0;
        }

        return maxSum;
    }

    //Extended version of above problem
    static int[] printMaxSubArray(int[] nums) {
        int n = nums.length;
        int sum = 0, maxSum = Integer.MIN_VALUE;
        int start = 0, end = 0, tempStart = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];

            if (sum > maxSum) {
                maxSum = sum;
                start = tempStart; 
                end = i;            
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;  
            }
        }

        int[] result = new int[end - start + 1];
        for (int i = start; i <= end; i++) {
            result[i - start] = nums[i];
        }

        return result;
    }
    public static void main(String[] args) {
        
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; 

        System.out.println(maxSubArray(nums));

        int[] result = printMaxSubArray(nums);

        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
