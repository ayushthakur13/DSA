import java.util.Scanner;

public class fullPyramid {
    
    static void pattern1(int r){ 
        for (int i = 0; i < r; i++) {

            for(int j = 0; j < r-i-1; j++)
                System.out.print(" ");

            for(int k = 0; k < 2*i+1; k++)
                System.out.print("*");
            
            System.out.println();
        }
    }

    static void pattern2(int r){             // inverted
        for (int i = 0; i < r; i++) {

            for(int j = 0; j < i; j++)
                System.out.print(" ");

            for(int k = 0; k < 2*(r-i)-1; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    static void pattern3(int r){
        for (int i = 0; i < r; i++) {
            
            for(int j = 0; j < r-i-1; j++)
                System.out.print(" ");

            for (char k = 'A'; k <= 'A'+i; k++) 
                System.out.print(k);

            for(char l = (char)('A'+i-1); l >= 'A'; l--)
                System.out.print(l);
            
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

        sc.close();
    }

}
