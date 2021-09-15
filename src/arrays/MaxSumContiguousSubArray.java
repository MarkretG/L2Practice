/**
input:[1,1,1,-4,5,6]
output:max 11....[5,6]
 */
package arrays;
public class MaxSumContiguousSubArray {
    public static void main(String[] args) {
        //int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] arr={-1,2,3,-2,-5,10,-4,12,-3};
        int max=arr[0],sum=0,startIndex=0,endIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum>max)
            {
                max=sum;
                startIndex++;
                endIndex=i;
            }
            if(sum<0)
            {
                sum=0;
            }
        }
        System.out.println(max);
        for (int k=startIndex;k<=endIndex;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }
}
