package sorting;

import java.util.Arrays;

public class MergeSort {
    private static void merge(int[] arr,int l,int mid,int r)
    {
        int a1Size=mid-l+1;
        int a2Size=r-mid;
        int[] arr1=new int[a1Size];
        int[] arr2=new int[a2Size];
        for (int i=0;i<a1Size;i++)
        {
            arr1[i]=arr[l+i];
        }
        for (int j=0;j<a2Size;j++)
        {
            arr2[j]=arr[mid+1+j];
        }
        int i=0,j=0,k=l;
        while (i<a1Size&&j<a2Size)
        {
            if(arr1[i]<=arr2[j])
            {
                arr[k++]=arr1[i++];
            }
            else {
                arr[k++]=arr2[j++];
            }
        }
        while (i<a1Size)
        {
            arr[k++]=arr1[i++];
        }
        while (j<a2Size)
        {
            arr[k++]=arr2[j++];
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
         int[] arr={5,8,9,10,4,2,1};
         mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
