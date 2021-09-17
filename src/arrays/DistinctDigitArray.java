/**
input:arr={111,222,333,444,666};
output:[1,2,3,4,5,6]
 */
package arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class DistinctDigitArray {
    private static List<Integer> distinctDigitArray(int[] arr)
    {
        String str="";
        List list=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
        {
            str+=arr[i];
        }
        long num=Long.parseLong(str);
        while (num>0)
        {
            long rem=num%10;
            if(!list.contains(rem))
            {
                list.add(rem);
            }
            num=num/10;
        }
        return list;
    }
    public static void main(String[] args) {
        int[] arr={111,222,333,444,666};
        List<Integer> list=distinctDigitArray(arr);
        Collections.sort(list);
        System.out.println(list);
    }
}
