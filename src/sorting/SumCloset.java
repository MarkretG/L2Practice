/**
 * Input:
 * N = 3
 * arr[] = {-8 -66 -60}
 * Output: -68
 * Explanation: Sum of two elements closest to
 * zero is -68 using numbers -60 and -8.

 */
package sorting;
import java.util.Arrays;
public class SumCloset {
    private static int findSumClosetToZero(int[] arr)
    {
       /* if (arr.length==2)
        {
            return arr[0]+arr[1];
        }*/
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int minSum=Integer.MAX_VALUE;
        int l=0,r=arr.length-1;
        int start=0,end=arr.length-1;
        while (l<r)
        {
            int sum=arr[l]+arr[r];
            if(sum==0)
            {
                return sum;
            }
            if(Math.abs(sum)<Math.abs(minSum))
            {
                minSum=sum;
                start=l;
                end=r;
            }
            ///sum=1...and minsum=-1 this condition
            else if (Math.abs(sum)==Math.abs(minSum))
            {
                if(sum>minSum)
                {
                    minSum=sum;
                }
            }
            if (sum<0)
                l++;
            else {
                r--;
            }
        }
        System.out.println("("+arr[start]+","+arr[end]+")");
        return minSum;

    }
    public static void main(String[] args) {
        int[] arr= {18,-1};
        int minSum=findSumClosetToZero(arr);
        System.out.println(minSum);
    }
}
