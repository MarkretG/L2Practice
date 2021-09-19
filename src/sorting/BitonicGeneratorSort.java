/**
 * Input: N = 8
 * arr[] = {0, 1, 2, 3, 4, 5, 6, 7}
 * Output: 0 2 4 6 7 5 3 1
 * Explanation:
 * Even-place elements : 0, 2, 4, 6
 * Odd-place elements : 1, 3, 5, 7
 * Even-place elements in increasing order :
 * 0, 2, 4, 6
 * Odd-Place elements in decreasing order :
 * 7, 5, 3, 1
 **/
package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//-99 -27 -72 -82 19 56 55 47 66 -20 6 -54 92 50 -38 -68 54 -100 -52

public class BitonicGeneratorSort {
    private static long[] bitonicGeneratorSort(long[] arr)
    {
        List<Long> addList=new ArrayList<>();
        List<Long> evenList=new ArrayList<>();
        for (int i=0;i<arr.length;i+=2)
        {
            evenList.add(arr[i]);
        }
        System.out.println(evenList);
        for (int i=1;i<arr.length;i+=2)
        {
            addList.add(arr[i]);
        }
        Collections.sort(evenList);
        Collections.sort(addList,Collections.reverseOrder());
        int i;
        for(i=0;i<evenList.size();i++)
        {
            arr[i]=evenList.get(i);
        }
        for(int j=0;j<addList.size();j++)
        {
            arr[i++]=addList.get(j);
        }
        return arr;

    }
    public static void main(String[] args) {
        long[] arr={-99, -27, -72, -82, 19, 56, 55, 47, 66, -20, 6, -54, 92, 50, -38, -68, 54, -100, -52};
        //long[] arr={0, 1, 2, 3, 4, 5, 6, 7};
        long[] result=bitonicGeneratorSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
