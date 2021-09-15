/**
input:[1,2,3,1,1,3]
output:4

good pair condition (i<j)...arr[i]==arr[j]
 */

package arrays;
public class GoodPair {
    private static int getCountOfGoodPair(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((i<j)&&arr[i]==arr[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int count=getCountOfGoodPair(arr);
        System.out.println(count);
    }
}
