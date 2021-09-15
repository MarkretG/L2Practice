/**
input:[3,3,4,2,4,4,2,4,4]
output:4
the frequency of 4 is greater  than the half of the size of array
 */

package arrays;
import java.util.HashMap;
import java.util.Map;
public class Majority {
    private static int findMajority(int[] arr)
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int count=map.get(arr[i])+1;
                if(count>arr.length/2)
                {
                    return arr[i];
                }
                else {
                    map.put(arr[i],count);
                }
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int result=findMajority(arr);
        if (result!=-1)
        {
            System.out.println("majority element found"+result);
            return;
        }
        System.out.println("no majority element");
    }
}
