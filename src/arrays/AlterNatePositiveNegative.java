package arrays;
import java.util.Arrays;
public class AlterNatePositiveNegative {
    private  static  int[] getAlternateArray(int[] arr) {
        int[] array1 = new int[arr.length];
        int[] array2=new int[arr.length];
        int k = 0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                array1[k]=arr[i];
            }
        }
        int m = 0;
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<0)
            {
                array2[m]=arr[i];
            }
        }
        int l=0,r=0;
        int n=0;
        while (l<k&&m<r){
            arr[n++]=array1[l++];
            arr[n++]=array2[r++];
        }
        while (l<k)
        {
            arr[n++]=array1[l++];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] result=getAlternateArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
