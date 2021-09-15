/**
input:[1,2,3,4,5]
output:[2,1,4,3,5]
 */
package arrays;
import java.util.Arrays;
public class WaveArray {
    public static void main(String[] args) {
        //int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] arr={2,4,7,8,9,10};
        for(int i=0;i<arr.length-1;i++)
        {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
