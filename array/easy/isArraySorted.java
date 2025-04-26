public class isArraySorted {

    static boolean isSorted(int[] arr){

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) 
                return false;
        }

        return true;
    } 
    public static void main(String[] args) {
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 1, 5, 4, 2};

        System.out.println("Is Array sorted? = " + isSorted(arr1));
        System.out.println("Is Array sorted? = " + isSorted(arr2));
    }
}
