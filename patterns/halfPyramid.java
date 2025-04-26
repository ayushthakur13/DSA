import java.util.Scanner;

public class halfPyramid {

    static void pattern1(int r){
        for (int i = 0; i < r; i++) {
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(int r){            // inverted 
        for (int i = r; i > 0; i--) {
            for(int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int r){             
        for (int i = 0; i < r; i++) {
            for(char ch = 'A'; ch <= 'A'+i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern4(int r){
        for (int i = 1; i <= r; i++) {
            for(char ch = 'A'; ch <= 'A'+r-i; ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    static void pattern5(int r){
        for (int i = 0; i < r; i++) {

            char result = (char) ('A' + i); // casting

            for(int j = 0; j <= i; j++)
                System.out.print(result); 
            
            System.out.println();
        }
    }

    static void pattern6(int r){
        for (int i = 0; i < r; i++) {
            for(int j = (char)'A'+r-i-1; j < 'A'+r ; j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows : ");
        int rows = sc.nextInt();

        pattern1(rows);
        System.out.println();

        pattern2(rows);
        System.out.println();

        pattern3(rows);
        System.out.println();

        pattern4(rows);
        System.out.println();

        pattern5(rows);
        System.out.println();

        pattern6(rows);
        System.out.println();

        sc.close();
    }
}
