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
import java.util.List;

public class ArrayEqual {
    private static boolean isTwoArrayEquals(int[] arr1,int[] arr2)
    {
        List<Integer> list=new ArrayList<>();
        for (int i=0;i<arr1.length;i++)
        {
            list.add(arr1[i]);
        }
        for (int i=0;i<arr2.length;i++)
        {
            if(!list.contains(arr2[i]))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
       int[] arr1 = {1,2,5,4,0};
        int[] arr2 = {2,4,5,0,1};
        boolean result=isTwoArrayEquals(arr1,arr2);
        System.out.println(result);

    }
}
