import java.util.*;

public class primeNum {

    static void prime(int num){

        int counter = 0;
        
        for(int i=1; i*i<=num; i++){
            if(num%i==0){
                counter++;
                if((num/i)!=i)
                    counter++;
            }
        }

        if(counter==2 || num==1)
            System.out.println("Prime");
        else
            System.out.println("Not prime");
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        prime(n);
    }
}
