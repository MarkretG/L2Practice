/**
input:[2,5,1,3, 4,7] n=3...2n array elements
output:[2,3,5,4,1,7]....x1,y1,x2,y2...
 */

package Arrays;
import java.util.Arrays;
public class ShuffleArray {
    private static int[] getShuffleArray(int[] arr)
    {
        int[] result=new int[arr.length];
        int mid=arr.length/2;
        int l=0,r=mid,k=0;
        while (l<mid&&r<arr.length)
        {
            result[k++]=arr[l++];
            result[k++]=arr[r++];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] result=getShuffleArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
