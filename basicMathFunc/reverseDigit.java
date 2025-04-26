import java.util.Scanner;

public class reverseDigit {

    static void reverse(int num){
        
        int revNum = 0;

        while(num>0){
            int last = num%10;
            revNum = (revNum*10)+last;
            num = num/10;
        }

        System.out.println(revNum);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        reverse(n);
    }
}
