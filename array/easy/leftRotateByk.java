public class leftRotateByk {

    static int[] leftRotateByK(int[] arr, int k){

        int n = arr.length;
        k%=n;
        
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);

        return arr;
    }

    static void reverse(int[] arr, int low, int high){
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // left rotate by 3 places

        leftRotateByK(arr, k);

        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
