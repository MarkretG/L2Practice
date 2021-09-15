/**
Input:
N=2,M=3
Grid=
[[1,0,1],
[-8,9,-2]]
Output:
1
Explanation:
The sum of all elements of the matrix is
(1+0+1-8+9-2)=1.
 */

package matrix;
public class SumElementsMatrix {
    private static int getSumAllElementsInMatrix(int[][] mat,int row,int col)
    {
        int sum=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum+=mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int row=3,col=5;
        int[][] mat={{1,0,1,0,1},
                {0,1,0,1,0},
                {-1,-1,-1,-1,-1}};
        int sum=getSumAllElementsInMatrix(mat,row,col);
        System.out.println(sum);
    }
}
