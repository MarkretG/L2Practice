package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArrays {
    private static int[] getIntersectionArray(int[] arr1,int[] arr2)
    {
        List<Integer> list=new ArrayList<>();
        int len=Math.min(arr1.length,arr2.length);
        int[] arr=new int[len];
        int k=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(list.contains(arr1[i]))
            {
                continue;
            }
            list.add(arr1[i]);
            arr[k++]=arr1[i];

        }
        for(int i=0;i<arr2.length;i++)
        {
            if(list.contains(arr1[i]))
            {
                continue;
            }
            list.add(arr2[i]);
            arr[k++]=arr2[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1={1,2,2,1},arr2={2,2};
        getIntersectionArray(arr1,arr2);
    }
}
