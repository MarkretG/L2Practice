/**
input:[2,2,1]
output:1
 */

package Arrays;
import java.util.HashMap;
import java.util.Map;
public class SingleNumber {
    private static  int findSingleNumber(int[] arr)
    {
        int single=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> K:map.entrySet())
        {
            if(K.getValue()==1)
            {
             single=K.getKey();
                break;
            }

        }
        return single;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int single=findSingleNumber(arr);
        System.out.println(single);
    }
}
