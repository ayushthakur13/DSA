public class bubbleSort {
    public static void main(String[] args) {
        
        int[] arr = {13, 24, 46, 35, 57, 68, 79, 86, 99, 10};
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i : arr){
            System.out.print(i + " ");
        }   
    }
}
