/**
Input:
N = 3
matrix[][] = [[1 2 3],
              [4 5 6],
              [7 8 9]]
Output:
3 6 9
2 5 8
1 4 7
 */
package matrix;
public class RotateAntiClockWise {
    private static int[][] rotateAntiClock(int[][] mat,int n)
    {
        for(int i=0;i<n/2;i++)
        {
            for(int j=i;j<n-1-i;j++)
            {
              int temp=mat[i][j];
              mat[i][j]=mat[j][n-1-i];
              mat[j][n-1-i]=mat[n-1-i][n-1-j];
              mat[n-1-i][n-1-j]=mat[n-1-j][i];
              mat[n-1-j][i]=temp;
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int n=3;
        int[][] mat={{1, 2,3,10},
                 {4,5,6,11},
                 {7, 8,9,12}};
        int[][] result=rotateAntiClock(mat,n);
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
