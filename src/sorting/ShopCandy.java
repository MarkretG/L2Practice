/**
 * find what is the minimum amount of money you have to spend to buy all the N different candies. Secondly, you have to find what is the maximum amount of money you have to spend to buy all the N different candies.
 * In both the cases you must utilize the offer i.e. you buy one candy and get K other candies for free.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * K = 2
 * candies[] = {3 2 1 4}
 *
 * Output:
 * 3 7

 */
package sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShopCandy {
    private static List<Integer> findMinAndMaxCost(int[] candies,int N,int k)
    {
        List<Integer> cost=new ArrayList<>();
        int minCost=0,maxCost= 0,index=0;
        Arrays.sort(candies);
        for(int i=0;i<N-k;i++)
        {
            minCost+=candies[i];
        }
        cost.add(minCost);
        for(int i=N-1;i>index+k;i--)
        {
            maxCost+=candies[i];
        }
        cost.add(maxCost);
        return cost;

    }
    public static void main(String[] args) {
        int N=5,K=4;
        int[] candies={3 ,2, 1, 4,5};
        List<Integer> costs=findMinAndMaxCost(candies,N,K);
        System.out.println(costs);
    }
}
