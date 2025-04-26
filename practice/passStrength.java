import java.util.HashMap;
import java.util.Map;

public class passStrength {

    static void checkPasswordStrength(String password) {
        
        if (password.length() < 8) {
            System.out.println("Weak Password");
            return;
        }

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String specialChars = "!@#$%^&*()-+";

        Map<Character, Integer> charCount = new HashMap<>();

        for (char ch : password.toCharArray()) {

            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);

            if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (specialChars.indexOf(ch) != -1) hasSpecial = true;
        }

        // Check if any character repeats more than twice
        for (int count : charCount.values()) {
            if (count > 2) {
                System.out.println("Weak Password (character repeats more than twice)");
                return;
            }
        }

        if (hasLower && hasUpper && hasDigit && hasSpecial) 
            System.out.println("Strong Password");
        else 
            System.out.println("Weak Password");
        
    }

    public static void main(String[] args) {

        String password = "Strong@Pass123";

        checkPasswordStrength(password);
    }    
}
