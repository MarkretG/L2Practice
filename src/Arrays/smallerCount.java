package Arrays;

import java.util.Arrays;

public class smallerCount {
    private static int[] getSmallerArray(int[] arr)
    {
        int[] result=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(i==j)
                {
                    continue;
                }
                if(arr[i]>arr[j])
                {
                    count++;
                }
            }
            result[k++]=count;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] result=getSmallerArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
