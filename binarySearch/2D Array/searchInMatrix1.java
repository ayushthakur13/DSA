public class searchInMatrix1 {

    static boolean searchInMatrix(int[][] matrix, int target){

        int n = matrix.length;
        int m = matrix[0].length;
        
        int low = 0, high = (n * m) - 1;

        while(low <= high){

            int mid = low + (high-low) / 2;
            int row = mid/m;
            int col = mid%m;

            if(matrix[row][col] == target) return true;
            else if(matrix[row][col] > target) high = mid-1;
            else low = mid+1;
        }

        return false;
    }
    public static void main(String[] args) {
        
        int[][] matrix = {
            {3,4,7},
            {9,13,15},
            {16,20,25}
        };

        int target = 20;

        System.out.println(searchInMatrix(matrix, target));
    }
}
