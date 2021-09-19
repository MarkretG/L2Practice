/**
 *   int[] arr={10,5,3,9,2};
 *         int k=7;
 *
 *         [5, 9, 10, 3, 2]
 *

 */

package sorting;
import java.util.*;
public class SortAbsoluteDiff {
    private static void sortByAbsoluteDiff(int[] arr,int k)
    {
        TreeMap<Integer, ArrayList<Integer>> map=new TreeMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int diff=Math.abs(arr[i]-k);
            ArrayList<Integer> list=map.getOrDefault(diff,new ArrayList<>());
            list.add(arr[i]);
            map.put(diff,list);
            System.out.println(map);
        }
        //System.out.println(map);
        int index=0;
        for(Map.Entry entry:map.entrySet())
        {
            ArrayList<Integer> list=map.get(entry.getKey());
            for(int j=0;j< list.size();j++)
            {
                arr[index++]=list.get(j);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={10,5,3,9,2};
        int k=7;
        sortByAbsoluteDiff(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}
