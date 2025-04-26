import java.util.*;

public class GCDorHCF {

    static void gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if(a==0) 
            System.out.println(b);
        else
            System.out.println(a);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any two numbers : ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        gcd(n1, n2);
    }
}
