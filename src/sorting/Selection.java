package sorting;

import java.util.Arrays;

public class Selection {
    private static  void selectionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int min=arr[i];
            int index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<min)
                {
                    min=arr[j];
                    index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[index];
            arr[index]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={2,9,6,3,8,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
