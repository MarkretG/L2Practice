/**
input:[1,2,3,4,5]
output:[1,2,3,4,5]....arr length times rotate
 */

package arrays;
import java.util.Arrays;
public class RotateArray {
    private static  int[] rotateArray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int num=arr[arr.length-1];
            for (int j=arr.length-1;j>=1;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=num;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] result=rotateArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
