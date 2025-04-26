public class searchInMatrix2 {

    static boolean searchInMatrix(int[][] matrix, int target){

        int m = matrix.length;
        int n = matrix[0].length;

        int top =0 , right = n-1;

        while(top<m && right >= 0){

            int current = matrix[top][right];
            
            if(current == target) return true;
            else if(current > target) right--;
            else top++;
            
        }

        return false;
    }
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16}
        };

        int target = 8;

        System.out.println(searchInMatrix(matrix, target));
    }
}
