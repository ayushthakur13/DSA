import java.util.ArrayList;

public class intersection {

    static ArrayList<Integer> intersectionArray(int[] arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;

        ArrayList<Integer> list = new ArrayList<>();

        int i=0, j=0;

        while(i<n1 && j<n2){

            if(arr1[i] < arr2[j]) 
                i++;

            else if(arr2[j] < arr1[i]) 
                j++;

            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }

        return list;

    }
    public static void main(String[] args) {
        
        int[] arr1 = {1,2,2,3,3};
        int[] arr2 = {1,2,3,4,4};

        ArrayList<Integer> intersection = intersectionArray(arr1, arr2);

        for(int i : intersection){
            System.out.print(i+" ");
        }
    }
}
