/**
input:[1,5,3,2]
output:1
1+5=6.....3+2=5...diff=6-5=1
 */

package Arrays;
public class BalancedArray {
    private static int findBalancedArrayDiff(int[] arr)
    {
        int mid=arr.length/2;
        int sum=0,sum1=0;
        for(int i=0;i<mid;i++)
        {
            sum+=arr[i];
        }
        for(int i=mid;i<arr.length;i++)
        {
            sum1+=arr[i];
        }
        int result=Math.abs(sum-sum1);
        return result;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int balancedArrayDiff=findBalancedArrayDiff(arr);
        System.out.println(balancedArrayDiff);
    }
}
