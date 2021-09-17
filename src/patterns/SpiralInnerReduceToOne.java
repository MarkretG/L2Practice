/**
int n=4
 4 4 4 4 4 4 4
 4 3 3 3 3 3 4
 4 3 2 2 2 3 4
 4 3 2 1 2 3 4
 4 3 2 2 2 3 4
 4 3 3 3 3 3 4
 4 4 4 4 4 4 4

 */

package patterns;
public class SpiralInnerReduceToOne {
    private static int[][] getInnerPattern(int n)
    {

        int length=(2*n)-1;
        int[][] mat=new int[length][length];
        int left=0,right=length-1;
        while (n!=0)
        {
            for(int i=left;i<=right;i++)
            {
                for(int j=left;j<=right;j++)
                {
                    if(i==left||j==left||i==right||j==right)
                    {
                      mat[i][j]=n;
                    }
                }
            }
            left++;
            right--;
            n--;
        }
        return mat;
    }
    public static void main(String[] args){
        int n=4;
        int[][] result=getInnerPattern(n);
        for(int i=0;i< result.length;i++)
        {
            for(int j=0;j<result.length;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
