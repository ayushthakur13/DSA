import java.util.HashMap;
import java.util.Map;

public class highestLowestFreq {

    static void frequency(int arr[], int n){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int maxFreq = 0, minFreq = n;
        int maxEle = -1, minEle = -1;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int element = entry.getKey();
            int freq = entry.getValue();
            
            if (freq > maxFreq) {
                maxEle = element;
                maxFreq = freq;
            }
            if (freq < minFreq) {
                minEle = element;
                minFreq = freq;
            }
        }

        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }
    public static void main(String[] args) {
        
        int arr[] = {10,5,10,15,10,5};
        int n = arr.length;

        if (n == 0) {
            System.out.println("The array is empty.");
            return;
        }

        frequency(arr, n);

    }
}
