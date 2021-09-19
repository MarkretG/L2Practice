/**
 * Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
 * Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
 *
 * Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
 * Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}
 */
package sorting;
import java.util.*;

public class FrequencyBasedSort {
    private static int[] frequencyBasedSort(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        int k=0;
        for(Map.Entry<Integer,Integer> entry:list)
        {
            for (int i=0;i<entry.getValue();i++)
            {
               arr[k++]=entry.getKey();
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2, 5, 2, 8, 5, 6, 8, 8};
        int[] result=frequencyBasedSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
