import java.util.Scanner;

public class diamond {

    static void pattern1(int r){                // full
        for (int i = 0; i < r; i++) {

            for(int j = 0; j < r-i-1; j++)
                System.out.print("  ");
            
            for(int k = 0; k < 2*i+1; k++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = 0; i < r; i++) {

            for(int j = 0; j < i; j++)
                System.out.print("  ");

            for(int k = 0; k < 2*(r-i)-1; k++) 
                System.out.print("* ");

            System.out.println();
        }
    }

    static void pattern2(int r){                // half
        
        for (int i = 0; i < r; i++) {

            for(int j = 0; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        for (int i = 0; i < r; i++) {

            for(int j = 0; j < r-i-1; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    static void pattern3(int r){                
        for (int i = 0; i < r; i++) {

            for(int j = 0; j < r-i; j++)
                System.out.print("*");
            
            for(int k = 0; k < 2*i; k++)
                System.out.print(" ");

            for (int l = 0; l < r-i; l++) 
                System.out.print("*");
            
            System.out.println();
        }

        for (int i = 0; i < r; i++) {

            for(int j = 0; j <= i; j++)
                System.out.print("*");
            
            for(int k = 0; k < 2*(r-i-1); k++)
                System.out.print(" ");

            for (int l = 0; l <= i; l++) 
                System.out.print("*");
            
            System.out.println();
        }
    }

    static void pattern4(int r){                
        for (int i = 0; i < r; i++) {

            for(int j = 0; j <= i; j++)
                System.out.print("*");
            
            for(int k = 0; k < 2*(r-i-1); k++)
                System.out.print(" ");

            for (int l = 0; l <= i; l++) 
                System.out.print("*");
            
            System.out.println();
        }

        for (int i = 1; i < r; i++) {

            for(int j = r-1; j >= i; j--)
                System.out.print("*");
            
            for(int k = 0; k < 2*i; k++)
                System.out.print(" ");

            for(int j = r-1; j >= i; j--)
                System.out.print("*");
            
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

        sc.close();
    }

}
