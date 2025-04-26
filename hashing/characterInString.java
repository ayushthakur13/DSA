import java.util.Scanner;
public class characterInString{

    static void charCounter(String s){
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            hash[c - 'a']++; 
        }

        for (int i = 0; i < 26; i++) {
            if (hash[i] > 0) {
                System.out.println((char) (i + 'a') + " -> " + hash[i]);
            }
        }
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        charCounter(s);

        sc.close();
    }
}
