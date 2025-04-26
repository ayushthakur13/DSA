public class quickSort {

    static void QS(int[] arr, int low, int high) {

        if(low<high){
            int partition = partition(arr, low, high);
            QS(arr, low, partition-1);
            QS(arr, partition+1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        
        int pivot = arr[low];
        int i = low;
        int j = high;
        while(i<j){

            while(arr[i]<=pivot && i<high)
                i++;

            while(arr[j]>pivot && j>low)
                j--;

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;
    }
    public static void main(String[] args) {

        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int n = arr.length;

        QS(arr, 0, n - 1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
