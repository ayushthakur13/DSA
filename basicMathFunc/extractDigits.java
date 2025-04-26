import java.util.Scanner;

public class extractDigits {

    static void extract(int num){
        
        while(num>0){
            int last = num%10;
            System.out.print(last+" ");
            num = num/10;
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        extract(n);

    }
}
