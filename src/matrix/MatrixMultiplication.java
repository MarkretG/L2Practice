/**
  int[][] mat1= {
                 {1, 1},
                {2, 2}
               };
        int[][] mat2 = {
            {1, 1, 1},
            {2, 2, 2}
        };
 */

package matrix;
public class MatrixMultiplication {
    private static  int[][] getMultiplyMatrix(int[][] mat1,int[][] mat2,int row1,int row2,int col2)
    {
        int[][] result=new int[row1][col2];
        for(int i=0;i<row1;i++)
        {
            for (int j=0;j<col2;j++)
            {
                int sum=0;
                for (int k = 0; k < row2; k++) {
                    sum += mat1[i][k] * mat2[k][i];
                }
                result[i][j]=sum;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        //int[][] mat1={{1,2},{3,4}};
        //int[][] mat2={{1,1},{1,1}};
        int[][] mat1= {
                 {1, 1},
                {2, 2}
               };
        int[][] mat2 = {
            {1, 1, 1},
            {2, 2, 2}
        };
        int result[][]=getMultiplyMatrix(mat1,mat2,2,2,3);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
