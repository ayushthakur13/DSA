import java.util.ArrayList;
import java.util.List;

public class M_printSpiralMatrix {

    static void printSpiralMatrix(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        List<Integer> list = new ArrayList<>();

        int top = 0, left = 0, right = n-1, bottom = m-1;
        

        while(left<=right && top<=bottom){

            for(int i = left; i<=right; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top; i<=bottom; i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i = right; i>=left; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left<=right){
                for(int i = bottom; i>=top; i--){
                    list.add(matrix[i][left ]);
                }
                left++;
            }
        }        

        for(int i : list){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};

        printSpiralMatrix(matrix);
    }
}
