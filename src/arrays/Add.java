/**
input:[1,2,3]
output:[1,2,4]
 */
package arrays;
import java.util.Arrays;
public class Add {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] != 10) return digits;
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
    public static void main(String[] args) {
        int[] arr=ArrayUtil.INSTANCE.getArray();
        int[] result=plusOne(arr);
        System.out.println(Arrays.toString(result));;
        /*int[] result=new int[arr.length+1];
        int carry=0;
        int k=0;
        if ((arr[arr.length-1]+1)%10!=0)
        {
            result[k++]=arr[arr.length-1]+1;
        }
        else
        {
            int num=(arr[0]+1);
            result[k++]=num%10;
            carry=num/10;
        }

        for(int i=arr.length-2;i>=0;i--)
        {
            int m=arr[i]+carry;
            result[k++]=m%10;
            carry=m/10;
        }
        if (carry!=0)
        {
           result[k++]=carry;
        }
        for (int i=k-1;i>=0;i--)
        {
            System.out.print(result[i]+" ");
        }*/
    }
}
