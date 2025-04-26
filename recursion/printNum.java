import java.util.Scanner;

public class printNum {

    static void printNumNtimes(int i, int n){
        if(i>n) 
            return;

        System.out.println(i);
        printNumNtimes(i+1, n);
    }

    static void printNumOpposite(int n){
        if(n<1)
            return;

        System.out.println(n);
        printNumOpposite(n-1);
    }

    static void PrintNumBacktracking(int n){
        if(n<1)
            return;
        PrintNumBacktracking(n-1);
        System.out.println(n);
    }

    static void PrintNumBacktrackingOpposite(int i, int n){
        if(i>n)
            return;
        PrintNumBacktrackingOpposite(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        printNumNtimes(1,num);

        System.out.println("Opposite : ");
        printNumOpposite(num);

        System.out.println("Backtracking : ");
        PrintNumBacktracking(num);

        System.out.println("Opposite Backtracking : ");
        PrintNumBacktrackingOpposite(1, num);

        sc.close();
    }    
}
