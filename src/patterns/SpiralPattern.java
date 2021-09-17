package patterns;

public class SpiralPattern {
    private static int[][] getSpiralMatrix(int n)
    {
        int[][] mat=new int[n][n];
        int val=1;
        int rowStart=0,rowEnd=n-1,colStart=0,colEnd=n-1;
        while (rowStart<=rowEnd&&colStart<=colEnd)
        {
            for (int i=colStart;i<=colEnd;i++)
            {
                mat[rowStart][i]=val++;
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++)
            {
                mat[i][colEnd]=val++;
            }
            colEnd--;
            for (int j=colEnd;j>=colStart;j--)
            {
                mat[rowEnd][j]=val++;
            }
            rowEnd--;
            for (int j=rowEnd;j>=rowStart;j--)
            {
                mat[j][colStart]=val++;
            }
            colStart++;
        }
        return mat;
    }
    public static void main(String[] args) {
        int n=5;
        int[][] result=getSpiralMatrix(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(result[i][j]<10) {
                    System.out.print(result[i][j] + "  ");
                }
                else
                {
                    System.out.print(result[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
