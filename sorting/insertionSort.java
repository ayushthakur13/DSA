public class insertionSort {
    public static void main(String[] args) {

        int[] arr = {13, 24, 46, 35, 57, 68, 79, 86, 99, 10};
        int n = arr.length;

        for(int i=0; i<n; i++){
            int j = i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
