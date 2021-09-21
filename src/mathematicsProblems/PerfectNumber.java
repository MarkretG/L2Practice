/**
 * Input:
 * N = 6
 * Output:
 * 1
 * Explanation:
 * Factors of 6 are 1, 2, 3 and 6.
 * Excluding 6 their sum is 6 which
 * is equal to N itself. So, it's a
 * Perfect Number.

 */

package mathematicsProblems;
public class PerfectNumber {
    private static int isPerfectNumber(long num)
    {
        double n=Math.sqrt(num);
        int sum=1;
        if(num==1)
        {
            return 1;
        }
        for(int i=2;i<=(int)n;i++)
        {
            if(num%i==0) {
                sum += i;
                if(n*n!=num) {
                    sum += num / i;
                }
            }
        }
        System.out.println(sum);
        if(num==sum)
            return 1;
        return 0;
    }
    public static void main(String[] args) {
        long n=10;
        int result=isPerfectNumber(n);
        System.out.println(result);

    }
}
