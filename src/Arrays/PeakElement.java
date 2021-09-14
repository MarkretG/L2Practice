/**
input:[1,2,3,4]
output:2....peak element index
 */

package Arrays;
public class PeakElement {
    private static int findPeakIndex(int[] arr,int len)
    {
        if(len==1)
        {
            return 0;
        }
        if(arr[0]>=arr[1])
        {
            return 0;
        }
        if(arr[len-1]>=arr[len-2])
        {
            return len-1;
        }
        for(int i=1;i<len-1;i++)
        {
            if(arr[i]>=arr[i+1]&&arr[i]>=arr[i-1])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int index=findPeakIndex(arr,arr.length);
        if(index==-1)
        {
            System.out.println("no peak element in the array");
        }
        else {
            System.out.println("peak element is"+" "+arr[index]+" index:"+" "+index);
        }

    }
}
