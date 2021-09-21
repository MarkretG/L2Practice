/**
 * Input:
 * N = 1234006
 * Output: 1
 * Explanation: Total number of digits in
 * N = 7. Middle digit is 4. LHS = 1+2+3 = 6
 * and RHS = 0+0+6 = 6. LHS is equal to RHS.

 */

package mathematicsProblems;
public class NumberBalanced {
    private static boolean isNumberBalanced(String str)
    {
        int mid=str.length()/2;
        int sum=0,sum1=0;
        for(int i=0;i<mid;i++)
        {
            sum+=str.charAt(i)-48;
        }
        System.out.println(sum);
        for(int i=mid+1;i<str.length();i++)
        {
            sum1+=str.charAt(i)-48;
        }
        System.out.println(sum1);
        return sum==sum1;
    }
    public static void main(String[] args) {
        String str="12345";
        boolean result=isNumberBalanced(str);
        System.out.println(result);
    }
}
