/**
 int[] arr={3,10,8,6};
 output;2

 */

package arrays;
import java.util.Arrays;
public class MinimumDifferencePair {
    private static int getMinimumDifferencePair(int[] arr)
    {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++)
        {
            int num=arr[i]-arr[i-1];
            if(num<min)
            {
                min=num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        //int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] arr={3,10,8,6};
        int result=getMinimumDifferencePair(arr);
        System.out.println(result);

    }
}
