/**
 Input:
 N = 9
 Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
 Output:
 9 -2 4 -1 5 -5 0 -3 2

 */

package arrays;
import java.util.Arrays;
public class AlterNatePositiveNegative {
    private  static  int[] getAlternateArray(int[] arr) {
        int[] positive = new int[arr.length];
        int[] negative=new int[arr.length];
        int k = 0;
        int r=0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>=0)
            {
                positive[k++]=arr[i];
            }
            else {
                negative[r++]=arr[i];
            }
        }
        int m = 0;
        int l=0;
        int n=0;
        while (l<k&&m<r){
            if (n%2==0)
            {
                arr[n++]=positive[l++];
            }
            else {
                arr[n++] =negative[m++];
            }
        }
        while (l<k)
        {
            arr[n++]=positive[l++];
        }
        while (m<r)
        {
            arr[n++]=negative[m++];
        }
        return arr;
    }
    public static void main(String[] args) {
        //int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] arr= {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int[] result=getAlternateArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
