import java.util.Scanner;

public class numHalfPyr {
    
    static void pattern1(int r){
        for (int i = 1; i <= r; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern2(int r){               // inverted
        for (int i = 0; i < r; i++) {

            for(int j = 1; j <= r-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern3(int r){           
        for (int i = 1; i <= r; i++) {

            for(int j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern4(int r){
        int start;
        for (int i = 0; i < r; i++) {

            if(i % 2 == 0) 
                start = 1;
            else 
                start = 0;
            
            for(int j = 0; j <= i; j++){
                System.out.print(start);
                start = 1-start;
            }
                
            System.out.println();
        }

    }

    static void pattern5(int r){
        for (int i = 1; i <= r; i++) {

            for (int j = 1; j <= i; j++) 
                System.out.print(j);
            
            for (int k = 0; k < 2*(r-i); k++) 
                System.out.print(" ");
            
            for (int l = i; l > 0; l--) 
                System.out.print(l);
            
            System.out.println();
        }        
    } 

    static void pattern6(int r){
        int counter = 1;
        for (int i = 0; i < r; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print(counter+" ");
                counter++;
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
