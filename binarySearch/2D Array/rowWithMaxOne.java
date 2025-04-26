public class rowWithMaxOne {

    static int rowWithMaxOnes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
    
        int maxRow = -1;
        int right = n - 1; 
    
        for (int i = 0; i < m; i++) {
            while (right >= 0 && matrix[i][right] == 1) {
                maxRow = i;
                right--; // Move left
            }
        }
    
        return maxRow;
    }
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {0,1,1,1}, 
            {0,0,1,1}, 
            {1,1,1,1}, 
            {0,0,0,0}
        };

        System.out.println(rowWithMaxOnes(matrix));
    }
}
