package arrays;
public class MinimumJump {
    private static int findMinimumJump(int[] arr)
    {
        int len=arr.length-1;
        int jumpCount=0,current=0,max=0;

        for(int i=0;i<len;i++) {
            if(arr[i]+i>max)
            {
                max=arr[i]+i;
            }
            if(current==i)
            {
                jumpCount++;
                current=max;
            }
        }
        return jumpCount;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,1,4};
        int result=findMinimumJump(arr);
        System.out.println(result);
    }
}
