package patterns;

public class XOPattern {
    private  static char[][] getXOPatternMatrix(int n)
    {
        char[][] mat=new char[n][n];
        char ch='X';
        int rowStart=0,rowEnd=n-1,colStart=0,colEnd=n-1;
        while(rowStart<=rowEnd&&colStart<=colEnd)
        {

            for(int i=colStart;i<=colEnd;i++)
            {
                mat[rowStart][i]=ch;
            }
            rowStart++;
            for(int i=rowStart;i<=rowEnd;i++)
            {
                mat[i][colEnd]=ch;
            }
            colEnd--;
            for (int j=colEnd;j>=colStart;j--)
            {
                mat[rowEnd][j]=ch;
            }
            rowEnd--;
            for(int j=rowEnd;j>=rowStart;j--)
            {
                mat[j][colStart]=ch;
            }
            colStart++;

           ch= ch=='X'?'0':'X';
        }
       return mat;
    }
    public static void main(String[] args) {
        int n=5;
        char[][] result=getXOPatternMatrix(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(result[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
