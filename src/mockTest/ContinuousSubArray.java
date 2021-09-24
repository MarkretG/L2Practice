package mockTest;

import java.util.Scanner;

/**
 * Example 1:
 * Input: N = 5, S = 12
 * A[ ] = {1,2,3,7,5}
 * Output: 2 4
 * Explanation: The sum of elements from 2nd position to 4th position is 12
 *
 *
 * Input: N = 10, S = 15
 * A[ ] = {1,2,3,4,5,6,7,8,9,10}
 * Output: 1 5

 */

public class ContinuousSubArray {
    private static void findContinuousSubArray(int[] arr,int sum)
    {

        int startIndex=0,endIndex=0;
        for(int i=0;i<arr.length;i++)
        {
            int sum1=arr[i];
            int flag=0;
            for(int j=i+1;j<arr.length;j++)
            {
                sum1+=arr[j];
                if(sum1==sum)
                {
                    flag=1;
                    startIndex=i+1;
                    endIndex=j+1;
                    break;
                }
                if(sum1>sum)
                {
                    break;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        System.out.println("StartIndex:"+startIndex+" "+"EndIndex"+endIndex);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n=sc.nextInt();
        System.out.println("enter sum");
        int sum=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter array elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        findContinuousSubArray(arr,sum);

    }
}
