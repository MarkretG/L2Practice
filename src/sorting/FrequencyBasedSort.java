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
    private static List<Integer> frequencyBasedSort(List<Integer> list,Integer[] arr)
    {
        Map<Integer,Integer> mapCount=new HashMap<>();
        Map<Integer,Integer> mapIndex=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
          if(mapCount.containsKey(arr[i]))
          {
              mapCount.put(arr[i], mapCount.get(arr[i])+1);
          }
          else {
              mapCount.put(arr[i],1);
              mapIndex.put(arr[i],i);
          }
        }


        // System.out.println(mapCount);
        //System.out.println(mapIndex);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                /*{2=2, 5=2, 6=1, 8=3}
                {2=0, 5=1, 6=5, 8=3}*/
               // Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
                System.out.println(list);
                int frq1=mapCount.get(o1);
                int frq2=mapCount.get(o2);
                if(frq1!=frq2)
                {
                    return frq2-frq1;
                }
                else {
                    return mapIndex.get(o1)-mapIndex.get(o2);

                }


            }
        });
        return list;

    }
    public static void main(String[] args) {
        Integer[] arr={2, 5, 2, 8, 5, 6, 8, 8};
        List<Integer> list=Arrays.asList(arr);
        List<Integer> result =frequencyBasedSort(list,arr);
        System.out.println(result);
    }
}
