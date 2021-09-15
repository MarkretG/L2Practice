/**
input:[1,2,3,7,5]    sum=12
output:2 4
 */
package arrays;
public class SubArray {
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int sum=ArrayUtil.INSTANCE.getInput();
        int start=0,target=0;
        for (int i=0;i<arr.length-1;i++)
        {
            target+=arr[i];
            if(target==sum)
            {
                System.out.println(start+1);
                System.out.println(i+1);
                break;
            }
            if(target>sum)
            {
                start++;
                i=start;
                i--;
                target=0;
            }
        }
    }
}
