public class largestElement {

    static int largest(int arr[]){

        int n = arr.length;
        int largest = arr[0];

        for(int i=1; i<n; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }

        return largest;
    }
    public static void main(String[] args) {

        int arr[] = {10, 324, 45, 90, 980};

        System.out.println("Largest element = " + largest(arr));
    }
}
