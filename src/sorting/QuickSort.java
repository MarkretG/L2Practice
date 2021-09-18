package sorting;
import java.util.Arrays;
public class QuickSort {
    private static void quickSort(int[] arr,int left,int right)
    {
        if(left<right)
        {
            int i=left;
            int j=right;
            int pivot=arr[left];
            while (i<j)
            {
                i=i+1;
                while (i<=right&&arr[i]<pivot)
                {
                    i++;
                }
                while (j>=left&&arr[j]>pivot)
                {
                    j--;
                }
                if(i<j&&i<=right)
                {
                    swap(arr,i,j);
                }
            }
            swap(arr,left,j);
            quickSort(arr,left,j-1);
            quickSort(arr,j+1,right);
        }
    }
    private static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={2,9,6,3,8,7};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
