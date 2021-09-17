package arrays;
public class JumpGame {
    private  static boolean isReachOurGoal(int[] arr)
    {
        int goal=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]+i>=goal)
            {
                goal=i;
            }
        }
        return goal==0;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        boolean result=isReachOurGoal(arr);
        System.out.println(result);
    }
}
