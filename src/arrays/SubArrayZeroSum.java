/**
input:  int[] arr={4,2,-3,1,6};
output:yes
2,-3,1 is the sub array with zero sum...o(n)
 */

package arrays;
import java.util.HashSet;
import java.util.Set;
public class SubArrayZeroSum {
    private static boolean isSubArrayExists(int[] arr)
    {
        Set<Integer> set=new HashSet<>();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(arr[i]==0||sum==0||set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={-3,2,3,1,6};
        boolean result=isSubArrayExists(arr);
        System.out.println(result);
    }
}
