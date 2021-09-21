/**
 *   Given two positive numbers X and Y, check if Y is a power of X or not.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * X = 2, Y = 8
 * Output:
 * 1
 * Explanation:
 * 23 is equal to 8.

 */
package mathematicsProblems;
public class PowerOfNumber {
    private static int isPowerAnother(long x,long y)
    {
        int i=0;
        if(x==1&&y!=1)
        {
            return 0;
        }
        while (true)
        {
            if (Math.pow(x,i)==y)
            {
                return 1;
            }
            if (Math.pow(x,i)>y)
            {
                return 0;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        long x=2,y=9;
        int result=isPowerAnother(x,y);
        System.out.println(result);
    }


}
