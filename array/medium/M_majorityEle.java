public class M_majorityEle {

    static int majorityElement(int[] nums){
        
        int count = 0, mElement = -1;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            if(count == 0){
                count = 1;
                mElement = nums[i];
            }
            else if(nums[i] == mElement)
                count++;
            else    
                count--;
        }

        int verifyCount = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i] == mElement)
                verifyCount++;
        }

        if(verifyCount > n/2)
            return mElement;

        return -1;
    }

    //skip verification part if it is given in ques that there exists a majority element

    public static void main(String[] args) {

        int nums[] = {2,2,3,3,1,2,2};

        System.out.println(majorityElement(nums));
    }
}
