/**
sorted rotated array..
input:{5,6,1,2,3,4}
output:1
o(logn)..binary search
 */

package arrays;
public class MinimumElement {
    private static int getMinimumElement(int[] arr,int left,int right)
    {
        while (left<right)
        {
            //int mid=left+(right-left)/2;
            int mid=(left+right)/2;
            if(arr[mid]==arr[right])
                right--;
            else if(arr[mid]>arr[right])
                left=mid+1;
            else {
                right=mid;
            }
        }
        return arr[right];
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,5,7};
        int minimum=getMinimumElement(arr,0,arr.length-1);
        System.out.println(minimum);

    }
}
