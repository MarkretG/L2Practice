/**
 int n=4,x=1,y=2;
        int[] arr={1,2,3,2};
        output:1
        int[]={3,5,4,2,6,5,6,6,5,4,8,3}  x=3,y=6
        o/p:min :3
 */

package arrays;
public class MinimumDistance {
    private static int getMinimumDistance(int[] arr,int x,int y)
    {
        int min=Integer.MAX_VALUE;
        int prev=0;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]==x||arr[i]==y)
            {
                prev=i;
                break;
            }
        }
        for (;i<arr.length;i++)
        {
            if(arr[i]==x||arr[i]==y)
            {
                if(arr[i]!=arr[prev]&&(i-prev)<min)
                {
                    min=i-prev;
                }
                else
                {
                    prev=i;
                }
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int n=4,x=1,y=2;
        int[] arr={1,2,3,2};
        int minimumDistance=getMinimumDistance(arr,x,y);
        System.out.println(minimumDistance);

      /*  //another way
        prev=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x||arr[i]==y)
            {
                if (prev!=-1&&arr[prev]!=arr[i])
                {
                    min=Math.min(i-prev,min)
                }
                prev=i;
            }
        }*/
    }
}
