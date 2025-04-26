import java.util.Scanner;

public class checkPalindrome {

    static void palindromeCheck(int num){
        int copy = num;
        int revNum = 0;

        while(num>0){
            int last = num%10;
            revNum = (revNum*10)+last;
            num = num/10;
        }
        
        if(revNum==copy) 
            System.out.println("This number is palindrome");
        else 
            System.out.println("This number is not palindrome");

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number : ");
        int n = sc.nextInt();

        palindromeCheck(n);
    }
}
