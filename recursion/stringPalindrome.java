import java.util.Scanner;

public class stringPalindrome {

    static boolean checkPalindrome(String s, int i){
        int n = s.length();
        
        if(i>=n/2)
            return true;
        
        if(s.charAt(i)!=s.charAt(n-i-1))
            return false;
        
        return checkPalindrome(s, i+1);
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = sc.next();

        boolean result = checkPalindrome(s, 0);
        System.out.println(result);

        sc.close();
    }    
}
