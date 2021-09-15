/**
arr[]=[7,10,4,3,20,15]
k=3 kth smallest N=2 nth largest
output:7+15=22
 */

package arrays;
import java.util.Arrays;
public class SmallestLargest {
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int kthSmallest=ArrayUtil.INSTANCE.getInput();
        int nthLargest=ArrayUtil.INSTANCE.getInput();
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int sum=arr[kthSmallest-1]+arr[arr.length-nthLargest];
        System.out.println(sum);
    }
}
