/**
 * Input:
 * N = 5
 * A[] = {1,2,5,4,0}
 * B[] = {2,4,5,0,1}
 * Output: 1
 * Explanation: Both the array can be
 * rearranged to {0,1,2,4,5}

 */

package sorting;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayEqual {
    private static boolean isTwoArrayEquals(int[] arr1,int[] arr2)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr1.length;i++)
        {
            if(map.containsKey(arr1[i]))
            {
                map.put(arr1[i],map.get(arr1[i])+1);
            }
            else {
                map.put(arr1[i],1);
            }
        }
        for(int i=0;i<arr1.length;i++)
        {
            if(!map.containsKey(arr2[i]))
                return false;
            if(map.get(arr2[i])==0)
                return false;

            int count=map.get(arr2[i]);
            map.put(arr2[i],--count);
        }
        return true;
    }
    public static void main(String[] args) {
       int[] arr1 = {1,2,5,4,0};
        int[] arr2 = {2,4,2,0,1};
        boolean result=isTwoArrayEquals(arr1,arr2);
        System.out.println(result);

    }
}
