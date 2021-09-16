/**
Input: rowIndex = 3
Output: [1,3,3,1]
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1

[1, 3, 3, 1]
 */
package matrix;
import java.util.ArrayList;
public class PascalTriangle {
    private static ArrayList<ArrayList<Integer>> getResultList(int n)
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for (int i=1;i<=n;i++)
        {
            ArrayList<Integer> inner=new ArrayList<>();
            for(int space=0;space<n-i;space++)
            {
                System.out.print(" ");
            }
            int c=1;
            for(int k=1;k<=i;k++)
            {
                inner.add(c);
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }
            res.add(inner);
            System.out.println();
        }
        return res;
    }
    public static void main(String[] args) {
        int n=5;
        ArrayList<ArrayList<Integer>> result=getResultList(n);
        System.out.println(result.get(3));

    }
}
