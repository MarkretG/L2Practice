/**
 * Input:
 * nums = {2, 8, 5, 4}
 * Output:
 * 1
 * Explaination:
 * swap 8 with 4.
 * o(nLogn)

 */
package sorting;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinSwap {
    private static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private static int minSwaps(int[] arr)
    {
        int count=0;
        int[] temp= Arrays.copyOfRange(arr,0,arr.length);
        Arrays.sort(arr);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]!=temp[i])
            {
                count++;
                int init=arr[i];
                swap(arr,i,map.get(temp[i]));
                map.put(init,map.get(temp[i]));
                map.put(temp[i],i);

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={10, 19, 6, 3, 5};
        int result=minSwaps(arr);
        System.out.println(result);

    }
}
