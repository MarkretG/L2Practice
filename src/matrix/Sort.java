/**
input:
mat={{3,6,9},{2,5,8},{1,4,7}};
output:
1 4 7
2 5 8
3 6 9
 */

package matrix;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Sort {
    private static int[][] sort2dArrayAcrossColumns(int[][] mat,int n)
    {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                list.add(mat[j][i]);
            }
            Collections.sort(list);
            for(int k=0;k<list.size();k++)
            {
                mat[k][i]=list.get(k);
            }
            list.clear();
            System.out.println(list);
        }
        return mat;
    }
    public static void main(String[] args) {
        int n=3;
        int[][] mat={{3,6,9},{2,5,8},{1,4,7}};
        int[][] result=sort2dArrayAcrossColumns(mat,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
