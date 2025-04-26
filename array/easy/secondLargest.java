public class secondLargest {
    static int secondLarge(int[] arr) {
        
        int n = arr.length;
        if (n < 2) return -1; 
        
        int largest = arr[0] , sLargest = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                sLargest = largest;
                largest = arr[i];
            } 
            else if (arr[i] > sLargest && arr[i] != largest) { 
                sLargest = arr[i]; 
            }
        }

        return sLargest;
    }

    public static void main(String[] args) {

        int arr[] = {10, 324, 45, 90, 980, 980, 45, 90}; 
        
        System.out.println("Second largest = " + secondLarge(arr));
    }
}
