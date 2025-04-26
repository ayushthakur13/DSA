public class M_rotateMatrixBy90 {

    static void rotateMatrixBy90Degree(int[][] matrix){

        int n = matrix.length;

        // transpose
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // reverse each row
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }

        for(int[] rows : matrix){
            for(int i : rows){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){

        int[][] matrix = {
            {1,2,3}, 
            {4,5,6}, 
            {7,8,9}
        }; 

        rotateMatrixBy90Degree(matrix);
    }
}
