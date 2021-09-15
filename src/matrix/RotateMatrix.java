/**
Input: n = 2, m = 4
mat = {{1, 2, 1, 2},
       {2, 1, 2, 1}}
x = 2
Output: 1
Explanation: After two rotation mat is
same as the previous one.
 */

package matrix;
public class RotateMatrix {
    private static  boolean isSuperSimilar(int[][] mat,int row,int col,int x)
    {
        int[][] result=new int[row][col];
        int[] arr=new int[col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[j]=mat[i][j];
            }
            if(i%2==0)
            {
                 arr=rotateLeft(arr,x);
            }
            else {
                arr=rotateRight(arr,x);
            }
            for (int k=0;k< arr.length;k++)
            {
              result[i][k]=arr[k];
            }
        }
        return checkTwoMatrixSame(mat,result,row,col);
    }
    private static boolean checkTwoMatrixSame(int[][] mat,int[][] result,int row,int col)
    {
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                if(mat[i][j]!=result[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
    private static int[] rotateLeft(int[] arr,int x)
    {
        for(int i=0;i<x;i++)
        {
            int num=arr[0];
            for(int j=0;j<arr.length-1;j++)
            {
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=num;
        }
      return arr;
    }
    private static int[] rotateRight(int[] arr,int x)
    {
        for(int i=0;i<x;i++)
        {
            int num=arr[arr.length-1];
            for(int j=arr.length-1;j>=1;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[0]=num;
        }
        return arr;
    }
    public static void main(String[] args) {
        int row=2,col=4,x=2;
        int[][] mat={{1, 2, 1, 2},
            {2, 1, 2, 1}};
        /*int[][] mat= {{1, 2},
                  {5, 6}};*/
       boolean result=isSuperSimilar(mat, row,col,x);
       System.out.println(result);
    }
}
