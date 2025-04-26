public class removeDuplicate {

    static void removeDup(int[] arr){

        int n = arr.length;

        int i = 0;
        for(int j=1; j<n; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        int unique = i+1;

        System.out.println("Number of unique elements = " + unique);
    }
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 3};
        removeDup(arr);
    }
}
