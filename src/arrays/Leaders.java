/**
 * input: int[] arr={16,17,4,3,5,2};
 * o/p:2 5 17

 */

package arrays;
public class Leaders {
    private static void findLeaders(int[] arr)
    {
        int len=arr.length-1;
        int rightMostElement=arr[len];
        for(int i=len-1;i>=0;i--)
        {
            if(arr[i]>rightMostElement)
            {
                rightMostElement=arr[i];
                System.out.print(rightMostElement+" ");
            }
        }
        System.out.print(arr[len]+" ");
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0};
        findLeaders(arr);

    }
}
