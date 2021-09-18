package sorting;
import java.util.Arrays;
public class InsertionSort {
    private static void  insertionSort(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            int key=arr[i];
            int j=i-1;
            while (j>=0&&arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[++j]=key;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,9,6,3,8,7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
