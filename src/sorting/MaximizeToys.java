
package sorting;
import java.util.Arrays;
public class MaximizeToys {
    private static int findMaximizeToysBye(int[] arr,int k)
    {
        int count=0;
        int sum=0;
       for (int i=0;i<arr.length;i++)
       {
            sum+=arr[i];
           if(sum<=k)
           {
               count++;
           }
           if(sum>k)
           {
               break;
           }
       }
       return count;

    }
    public static void main(String[] args) {
        int[] arr={1,12,5,111,200,1000,10};
        int k=50;
        Arrays.sort(arr);
        int count=findMaximizeToysBye(arr,k);
        System.out.println(count);
    }
}
