/**
 * Consider a long alley with a N number of doors on one side. All the doors are closed initially. You move to and fro in the alley changing the states of the doors as follows: you open a door that is already closed and you close a door that is already opened. You start at one end go on altering the state of the doors till you reach the other end and then you come back and start altering the states of the doors again.
 * In the first go, you alter the states of doors numbered 1, 2, 3, … , n.
 * In the second go, you alter the states of doors numbered 2, 4, 6…
 * In the third go, you alter the states of doors numbered 3, 6, 9 …
 * You continue this till the Nth go in which you alter the state of the door numbered N.
 * You have to find the number of open doors at the end of the procedure.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * N = 2
 * Output:
 * 1
 * Explanation:
 * Initially all doors are closed.
 * After 1st go, all doors will be opened.
 * After 2nd go second door will be closed.
 * So, Only 1st door will remain Open.

 */
package mathematicsProblems;
public class NoOfDoors {
    private static  int getNoOfOpenDoors(int num)
    {
        int count=0;
        for (int i=1;i<=num;i++)
        {
            double n=Math.sqrt(i);
            //perfect square have odd factors
            if(n*n==i)
            {
                count++;
            }
        }
        return count;
    }
    private static boolean oddNoOfFactors(int num)
    {

        double n=Math.sqrt(num);
        if(n*n==num)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n=4;
        int count=getNoOfOpenDoors(n);
        for(int i=1;i<=4;i++)
        {
            if(oddNoOfFactors(i))
            {
                System.out.println("door:"+i+" "+"open"+" ");
            }
            else {
                System.out.println("door:"+i+" "+"close"+" ");
            }
        }
        System.out.println("open doors:"+count);

    }
}
