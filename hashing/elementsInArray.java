public class elementsInArray {

    static void freqCounterUsingArray(int a[], int n){
        final int N = 100; // Assuming elements are less than 100
        int[] hash = new int[N]; 

        for(int i=0; i<n; i++){
            hash[a[i]]++;
        }

        for(int i=0; i<N; i++){
            if(hash[i] > 0)
                System.out.println(i + " -> " + hash[i]);
        }
    }
    public static void main(String[] args) {

        int a[] = { 1, 2, 2, 3, 1, 4, 2 };
        int n = a.length;
        freqCounterUsingArray(a, n);

    }
}
