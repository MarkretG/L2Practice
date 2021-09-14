/**
Input:
N = 6, X = 54
arr[] = {10, 22, 28, 29, 30, 40}
Output: 22 30
Explanation: As 22 + 30 = 52 is closest to 54.

Example 2:

Input:
N = 5, X = 10
arr[] = {1, 2, 3, 4, 5}
Output: 4 5
Explanation: As 4 + 5 = 9 is closest to 10.
 */
package Arrays;
public class SumClosest {
    private static  void sumClosest(int[] arr,int sum)
    {
        int l=0,r=arr.length-1,startIndex=0,endIndex=0;
        int diff=Integer.MAX_VALUE;
        while (l<r)
        {
            int num=arr[l]+arr[r];
            if (Math.abs(num-sum)<diff)
            {
                diff=Math.abs(num-sum);
                startIndex=l;
                endIndex=r;
            }
            if(num>sum) //sort array .. num is larger decrease end index
            {
                r--;
            }
            else {
                l++;
            }
        }
        System.out.println(arr[startIndex]+" "+arr[endIndex]);
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int sum=ArrayUtil.INSTANCE.getInput();
        sumClosest(arr,sum);
    }
}
