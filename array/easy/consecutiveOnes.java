public class consecutiveOnes {

    static int maxConsecutiveOnes(int[] nums){

        int n = nums.length;
        int counter = 0, maxOnes = 0;

        for(int i=0; i<n; i++){
            if(nums[i]==1){
                counter++;
                if(counter>maxOnes)
                    maxOnes++;
            }
            else{
                counter=0;
            }
        }

        return maxOnes;

    }
    public static void main(String[] args) {

        int[] nums = {1,1,0,1,1,1,0,1,1};

        System.out.println(maxConsecutiveOnes(nums));
    }
}
