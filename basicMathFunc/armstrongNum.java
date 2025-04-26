import java.util.Scanner;

public class armstrongNum {

    static void armstrong(int num){
        int copy = num;
        int armstrongNum=0;

        while(num>0){
            int last = num%10;
            armstrongNum = armstrongNum + (last*last*last);
            num = num/10;
        }

        if(copy==armstrongNum)
            System.out.println("True");
        else
            System.out.println("False");

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        armstrong(n);
    }
}
