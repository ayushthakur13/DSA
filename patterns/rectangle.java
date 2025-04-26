import java.util.Scanner;

public class rectangle {

    static void pattern1(int r, int c){ // solid rectangle
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int r, int c){ // hollow rectangle 
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                if(i==0 || j==0 || i==r-1 || j==c-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows and columns : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        pattern1(rows, cols);
        System.out.println();

        pattern2(rows, cols);
        System.out.println();

        sc.close();
    }
}
