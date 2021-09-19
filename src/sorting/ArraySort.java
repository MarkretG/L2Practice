/**
i/p:[1,2,3,4]
true

[1,2,8,4]
false

 */

package sorting;
public class ArraySort {
    private static boolean isArraySorted(int[] arr)
    {
        for (int i=1;i<arr.length;i++)
        {
            if(!(arr[i]>=arr[i-1]))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={90,80,100,70,40,30};
        boolean result=isArraySorted(arr);
        System.out.println(result);
    }
}
