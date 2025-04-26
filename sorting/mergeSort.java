public class mergeSort {
    static void mergeSortFunction(int arr[], int low, int high) {
        if (low >= high) return; 
        int mid = (low + high) / 2;
        mergeSortFunction(arr, low, mid); 
        mergeSortFunction(arr, mid + 1, high); 
        merge(arr, low, mid, high); 
    }

    static void merge(int arr[], int low, int mid, int high) {
        int[] temp = new int[arr.length];
        int left = low;
        int right = mid + 1;
        int k = low; 

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }

        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }

        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        mergeSortFunction(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
