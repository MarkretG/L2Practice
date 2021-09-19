/**
 * N = 2, M = 3
 * arr1[] = {10, 12}
 * arr2[] = {5, 18, 20}
 * Output: 5 10 12 18 20
 * Explanation: Since you can't use any
 * extra space, modify the given arrays
 * to form
 * arr1[] = {5, 10}
 * arr2[] = {12, 18, 20}

 */

package sorting;
public class Merge {
    private static void merge(int[] arr1,int[] arr2)
    {
        int i=0,j=0;
        while (i<arr1.length&&j<arr2.length)
        {
            if(arr1[i]<arr2[j]) {
                System.out.print(arr1[i++]+" ");
            }
            else {
                System.out.print(arr2[j++]+" ");
            }
        }
        while (i<arr1.length)
        {
            System.out.print(arr1[i++]+" ");
        }
        while (j<arr2.length)
        {
            System.out.print(arr2[j++]+" ");
        }
    }
    public static void main(String[] args) {
       int[] arr1 = {1 ,3 ,5 ,7} ;
       int[] arr2 = {0, 2, 6, 8 ,9};
       merge(arr1,arr2);
    }
}
