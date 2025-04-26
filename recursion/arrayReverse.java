import java.util.Scanner;


public class arrayReverse {

    static void reverse(int[] ar, int l, int r){
        if(l>=r)
            return;
        
        int temp = ar[l];
        ar[l] = ar[r];
        ar[r] = temp;
        reverse(ar, l+1, r-1);
    }

    //better way
    static void reverse2(int[] ar, int i, int n){
        if(i>=n/2)
            return;
        
        int temp = ar[i];
        ar[i] = ar[n-i-1];
        ar[n-i-1] = temp;
        reverse2(ar, i+1, n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of element : ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.print("Enter element in array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        reverse(a, 0, n-1);

        System.out.print("First Reverse : ");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

        System.out.println();

        reverse2(a, 0, n);

        System.out.print("Second reverse : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

        sc.close();
    }    
}
