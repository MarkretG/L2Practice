/**
input:[1,2,3,4,5,6,7,8,9,10] ..key=8
output:7
 */
package Arrays;
import java.util.Arrays;
public class IndexArray {
    private static int findIndexOfGivenKey(int[] arr,int key)
    {
        int l=0,r=arr.length-1;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==key) {
                return mid;
            }
            if(arr[mid]<key)
            {
                l=mid+1;
            }
            else {
                r=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int key=ArrayUtil.INSTANCE.getInput();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int index=findIndexOfGivenKey(arr, key);
        System.out.println(index);
    }
}
