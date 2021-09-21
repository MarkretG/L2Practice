/**
 * Lucky numbers are subset of integers. Rather than going into much theory, let us see the process of arriving at lucky numbers,
 * Take the set of integers
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19,……
 * First, delete every second number, we get following reduced set.
 * 1, 3, 5, 7, 9, 11, 13, 15, 17, 19,…………
 * Now, delete every third number, we get
 * 1, 3, 7, 9, 13, 15, 19,….….
 * Continue this process indefinitely……
 * Any number that does NOT get deleted due to above process is called “lucky”.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Output: 0
 * Explanation: 5 is not a lucky number
 * as it gets deleted in the second
 * iteration.

 */

package mathematicsProblems;
public class Lucky {
    static int counter=2;
    private static boolean isLucky(int num)
    {
        if(counter>num)
        {
            return true;
        }
        if(num%counter==0)
        {
            return false;
        }
        int nextPositionOfNum=num-num/counter;
        counter++;
        return isLucky(nextPositionOfNum);
    }
    public static void main(String[] args) {
        int num=74;
        boolean result=isLucky(num);
        System.out.println(result);
    }
}
