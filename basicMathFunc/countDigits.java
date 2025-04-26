//import static java.lang.Math.log10;
import java.util.Scanner;

public class countDigits {

    static int counter(int num){
        int c = 0;

        while(num>0){
            num = num/10;
            c++;
        }
        return c;

        // int c = (int)(log10(num)+1); //Alternative
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        int count = counter(n);

        System.out.println("Number of digits : "+count);
    }
}
