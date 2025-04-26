import java.util.HashSet;
import java.util.Set;

public class unionOfArrays {

    static int[] union(int[] arr1, int[] arr2){
        
        Set <Integer> union = new HashSet<>();
        
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }

        int[] result = new int[union.size()];

        int i = 0;
        for (int num : union) {
            result[i++] = num;
        }

        return result;
    }
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,2,3,3};
        int[] arr2 = {1,2,3,4,4};

        int[] result = union(arr1, arr2);

        for(int i : result){
            System.out.print(i+" ");
        }
    }
}
