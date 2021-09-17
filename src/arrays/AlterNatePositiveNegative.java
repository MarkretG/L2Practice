package arrays;
import java.util.Arrays;
public class AlterNatePositiveNegative {
    private  static  int[] getAlternateArray(int[] arr) {
        int[] possitive = new int[arr.length];
        int[] negative=new int[arr.length];
        int k = 0;
        int r=0;
        for (int i=0;i<arr.length;i++)
        {
            if(k%2==0)
            {
                possitive[k++]=arr[i];
            }
            else {
                negative[k++]=arr[i];
            }
        }
        int m = 0;
        int l=0;
        int n=0;
        while (l<k&&m<r){
            if (n%2==0)
            {
                arr[n++]=possitive[l++];
            }
            else {
                arr[n++] =negative[m++];
            }
        }
        while (l<k)
        {
            arr[n++]=possitive[l++];
        }
        while (m<r)
        {
            arr[n++]=possitive[m++];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] result=getAlternateArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
