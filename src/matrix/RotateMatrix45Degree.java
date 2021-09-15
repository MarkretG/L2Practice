/**
 * n=3; 45 degree rotation
input:int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
 output:      1
             4 2
            7 5 3
             8 6
              9
 */

package matrix;
import java.util.ArrayList;
import java.util.List;
public class RotateMatrix45Degree {
    private static void rotateMatrix45Degree(int[][] mat,int n)
    {
        int count=0;
        while(count<2*n-1)
        {
            for(int i=0;i<Math.abs(n-count-1);i++)
            {
                System.out.print(" ");
            }
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if((i+j)==count)
                    {
                        list.add(mat[i][j]);
                    }
                }
            }
            System.out.println(list);
            for(int i=list.size()-1;i>=0;i--)
            {
                System.out.print(list.get(i)+" ");
            }
            System.out.println();
            count++;
        }
    }
    public static void main(String[] args) {
        int n=3;
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        rotateMatrix45Degree(mat,n);
    }
}
