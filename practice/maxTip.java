public class maxTip {

    static void printMaxTip(int[][] matrix){

        int m = matrix.length;
        int n = matrix[0].length;

        int maxSum = 0;
        int agent = -1;

        for (int i = 0; i < m; i++) {
            int rowSum = 0;

            for (int j = 0; j < n; j++) 
                rowSum += matrix[i][j];
            

            if(rowSum > maxSum){
                maxSum = rowSum;
                agent = i;
            }
        }

        System.out.println("Agent " + agent + " earned the highest tip: " + maxSum);

    }
    public static void main(String[] args) {
        
        int[][] tip = {
            {10, 20, 30, 40}, 
            {15, 25, 35, 45,}, 
            {5, 10, 15, 20}
        };

        printMaxTip(tip);
    }    
}
