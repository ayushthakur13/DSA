import java.util.Scanner;

public class fibonacci {

    static int fibonacciNum(int n){

        if(n<=1)
            return n;
        
        return fibonacciNum(n-1) + fibonacciNum(n-2);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int result = fibonacciNum(num);
        System.out.println(result);

        sc.close();
    }
}
