/**
input:arr={-1,2,-1,3,2};
o/p:3
 */
package arrays;
import java.util.HashMap;
import java.util.Map;
public class FirstNonRepeating {
    private static int firstNonRepeating(int[] arr)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==1)
            {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={-1,2,-1,3};
        int result=firstNonRepeating(arr);
        System.out.println(result);

    }
}
