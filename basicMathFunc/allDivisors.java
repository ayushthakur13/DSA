import java.util.*;

public class allDivisors {

    static void printDivisors(int num){
        //Simple method 
        for (int i = 1; i <= num; i++) {
            if(num%i==0)
                System.out.print(i+" ");
        }
        System.out.println();

        //Alternative with better time complexity
        List<Integer> list = new ArrayList<>();
        for(int i =1; i*i<=num; i++){

            if(num%i==0){

                list.add(i);

                if(num/i != i)
                    list.add(num/i);
            }
        }

        Collections.sort(list);

        for(int i : list){
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printDivisors(n);        
    }
}
