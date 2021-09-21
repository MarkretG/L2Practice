/**
 * Input: N = 97
 * Output: 1
 * Explanation: 97 is a prime number. Its
 * reverse 79 isalso a prime number. Thus
 * 97 is a  twisted Prime and so, answer is 1.

 */

package mathematicsProblems;
public class TwistedPrimeNUmber {
    private static int isTwistedPrime(int n)
    {
        int temp=n;
        int result=0;
        while (temp>0)
        {
            result=(result*10)+(temp%10);
            temp=temp/10;
        }
        System.out.println(result);
        int max=Math.max(n,result);
        double a=Math.sqrt(max);
        System.out.println(a);
        for (int i=2;i<(int)a;i++)
        {
            if(n%i==0||result%i==0)
            {
                return 0;
            }
        }
        //System.out.println(result);
        return 1;
    }
    public static void main(String[] args) {
        int n=10620793;
        int result=isTwistedPrime(n);
        System.out.println(result);

    }
}
