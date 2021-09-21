/**
 * Input:
 * N = 17
 * Output:
 * 1
 * Explanation:
 * (17)10 = (10001)2
 * Which is pallindrome hence
 * output is 1.

 */

package mathematicsProblems;
public class PalindromeNumber {
    private static boolean checkBinaryFormOfGivenNumberIsPalindrome(int num)
    {
        String str="";
        while (num>0)
        {
            int rem=num%2;
            str+=rem;
            num=num/2;
        }
        System.out.println(str);
        int i=0,j=str.length()-1;
        while (i<j)
        {
           if(str.charAt(i)!=str.charAt(j))
               return false;
           else {
               i++;
               j--;
           }
        }
        return true;
    }
    public static void main(String[] args) {
        int num=91;
        boolean result=checkBinaryFormOfGivenNumberIsPalindrome(num);
        System.out.println(result);

    }
}
