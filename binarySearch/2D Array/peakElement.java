public class peakElement {

    static int[] peakElementInMatrix(int[][] mat){

        int n = mat[0].length;

        int low = 0, high = n-1;

        while(low<=high){

            int mid  = low + (high-low) / 2;
            int rowMax = maxElement(mat, mid);

            int left = mid-1 >= 0 ? mat[rowMax][mid-1] : -1;
            int right = mid+1 < n ? mat[rowMax][mid+1] : -1;

            if(mat[rowMax][mid] > left && mat[rowMax][mid] > right) 
                return new int[] {rowMax, mid};

            else if(mat[rowMax][mid] < left) high = mid - 1;

            else low = mid + 1;

        }

        return new int[] {-1, -1};
    } 

    static int maxElement(int[][] nums, int col){

        int m = nums.length;
        int max = -1, index = -1;

        for(int row=0; row<m; row++){

            if(nums[row][col] > max){

                max = nums[row][col];
                index = row;
            }
        }

        return index;
    }
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {10,20,15},
            {21,30,14},
            {7,16,32},
        };

        int[] result = peakElementInMatrix(matrix);

        System.out.print("Index of peak element is : { ");
        for(int i : result){
            System.out.print(i + " ");
        }
        System.out.print("}");
    }
}
