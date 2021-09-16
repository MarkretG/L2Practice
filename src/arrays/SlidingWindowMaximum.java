/**
Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
 */

package arrays;
import java.util.Arrays;
public class SlidingWindowMaximum {
    private static  int[] getSlidingWindowArray(int[] arr,int k)
    {
        int[] result=new int[arr.length-k+1];
        int m=0;
        for(int i=0;i<arr.length-k+1;i++)
        {
            int max=0;
            for(int j=i;j<k+i;j++)
            {
              if(max<arr[j])
              {
                  max=arr[j];
              }
            }
            result[m++]=max;
        }
        return result;

    }
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};int  k = 3;
        int[] result=getSlidingWindowArray(arr,k);
        System.out.println(Arrays.toString(result));

    }
}
