import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;   

public class hashingUsingMap {

    static void numFreqCounter(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Frequency of each element in the array: ");
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }

    static void charFreqCounter(String s){

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.println("Frequency of each character in the string: ");
        for(Map.Entry<Character, Integer> e : map.entrySet()){
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Number hashing");
        System.out.println("2. Character hashing");
        System.out.println("3. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
             
                System.out.print("Enter the number of elements in the array: ");
                int n = sc.nextInt();
                int arr[] = new int[n];

                System.out.print("Enter the elements of the array: ");
                for(int i=0; i<n; i++){
                    arr[i] = sc.nextInt();
                }

                numFreqCounter(arr, n);
                break;
            
            case 2:
                System.out.print("Enter the string: ");
                String s = sc.next();
                charFreqCounter(s);
                break;

            case 3:
                System.out.println("Exiting...");
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
