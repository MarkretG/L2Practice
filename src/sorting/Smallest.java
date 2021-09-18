/*
        Input:
N = 6
arr[] = 7 10 4 3 20 15
K = 3
Output : 7
Explanation :
3rd smallest element in the given
array is 7.

 */
package sorting;
import java.util.Arrays;
public class Smallest {
    public static void main(String[] args) {
        int[] arr={7,10,4,3,20,15};
        int k=3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);

    }
}
