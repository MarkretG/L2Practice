/**
Input:
N = 4 , M = 4
 Arr[ ][ ] = { {0, 1, 1, 1},
 {0, 0, 1, 1},
 {1, 1, 1, 1},
 {0, 0, 0, 0} }

 */
package matrix;
public class ReplaceZeros {
    private static int[][] replaceMatrix(int[][] mat,int n)
    {
        int max=0;int index=0,val=0;
        for(int[] row:mat)
        {
            int count=0;
            for(int i=0;i<row.length;i++)
            {
                if(row[i]==1)
                {
                    count++;
                }
            }
            if(count>max) {
                val=index++;
            }
        }
        for(int j=0;j<n;j++)
        {
            mat[val][j]=0;
        }
        return mat;
    }
    public static void main(String[] args) {
        int n=4;
        int[][] mat={{0, 1, 1, 1},
                     {0, 0, 1, 1},
                     {1, 1, 1, 1},
                     {0, 0, 0, 0}};
        int[][] result=replaceMatrix(mat,n);
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
