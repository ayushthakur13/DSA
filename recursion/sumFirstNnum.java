import java.util.Scanner;

public class sumFirstNnum {
    
    //parameterised way
    static void sum(int n, int sum){

        if(n<1){
            System.out.println(sum);
            return;
        }
            
        sum(n-1, sum+n);
    }

    //functional way
    static int sum2(int n){
        if(n == 0)
            return 0;

        return n + sum2(n-1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        
        System.out.print("Parameterised way = ");
        sum(num, 0);

        System.out.print("Functional way = ");
        int result = sum2(num);
        System.out.println(result);

        sc.close();
    }
}
