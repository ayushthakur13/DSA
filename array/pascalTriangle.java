import java.util.List;
import java.util.ArrayList;


public class pascalTriangle {

    static int valueAtRowColOfPascalTri(int n, int r){

        n--; r--;
        int result = 1;

        for(int i=0; i<r; i++){
            result*=(n-i);
            result/=(i+1);
        }

        return result;
    }

    static int[] elementAtNthRow(int n){

        int[] elements = new int[n];

        int result = 1;
        elements[0] = result;

        for (int i = 1; i < n; i++) {
            result *= (n-i);
            result /= i;

            elements[i] = result;
        }

        return elements;
    }

    static List<List<Integer>> fullPascalTriangle(int n){

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {

            int result = 1;

            List<Integer> tempList = new ArrayList<>();
            tempList.add(result);

            for (int j = 1; j < i; j++) {
                result *= (i-j);
                result /= j;
    
                tempList.add(result);
            }

            list.add(tempList);
        }

        return list;

    }

    public static void main(String[] args){

        //assume rows of pascal triangle are in 1-based indexing.

        int r = 5, c = 3;
        System.out.println(valueAtRowColOfPascalTri(r, c));

        int n = 5;
        int[] pascalElements = elementAtNthRow(n);

        for(int i : pascalElements){
            System.out.print(i+" ");
        }
        System.out.println();

        int num = 5;
        List < List<Integer> > list = fullPascalTriangle(num);
        
        for(List<Integer> temp : list){
            for(int i : temp){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
