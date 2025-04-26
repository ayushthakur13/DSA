// if an element is 0, set its entire row and column to 0's.

public class M_setMatrixZero {

    static void setMatrixZero(int[][] matrix){

        int m = matrix.length; // rows
        int n = matrix[0].length; // columns

        int col_0 = 1;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){

                    matrix[i][0] = 0;
                    if(j!=0)
                        matrix[0][j] = 0;
                    else
                        col_0 = 0;
                }
            }
        }

        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0)
                        matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0){
            for(int j=0; j<n; j++)
                matrix[0][j] = 0;
        }

        if(col_0 == 0){
            for(int i=0; i<m; i++)
                matrix[i][0] = 0;
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,1,1}, 
            {1,0,1}, 
            {1,1,1}
        }; 

        setMatrixZero(matrix);
    }
}
