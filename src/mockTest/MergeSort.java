package mockTest;

import java.util.Arrays;

public class MergeSort {
    private static void merge(int[] arr,int l,int mid,int r)
    {
        int a1Size=mid-l+1;
        int a2Size=r-mid;
        int[] lArray=new int[a1Size];
        int[] rArray=new int[a2Size];
        for(int i=0;i<a1Size;i++)
        {
            lArray[i]=arr[l+i];
        }
        for(int j=0;j<a2Size;j++)
        {
            rArray[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;
        while (i<a1Size&&j<a2Size)
        {
            if(lArray[i]<=rArray[j])
            {
                arr[k++]=lArray[i++];
            }
            else {
                arr[k++]=rArray[j++];
            }
        }
        while (i<a1Size)
        {
            arr[k++]=lArray[i++];
        }
        while (j<a2Size)
        {
            arr[k++]=rArray[j++];
        }
    }
    private static void mergeSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);

        }
    }
    public static void main(String[] args) {
        int[] arr={10,7,8,9,3,2,78};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
