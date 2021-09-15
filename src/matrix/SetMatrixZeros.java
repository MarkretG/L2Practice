/**
Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
 */
package matrix;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class SetMatrixZeros {
    private static int[][] getMatrix(int[][] mat,int row,int col)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (mat[i][j] == 0) {
                    ans.add(i);
                    ans.add(j);
                }
            }
        }
        for(int i = 0 ; i<ans.size() ; i+=2){
            int k = ans.get(i);
            for(int j = 0 ; j<mat[0].length ; j++){
                mat[k][j] = 0;
            }
            k = ans.get(i+1);
            for(int j = 0 ; j<mat[0].length ; j++){
                mat[j][k] = 0;
            }
        }
       /* for(int i=0;i<row;i++) {
            for (int j = 0; j < col; j++) {
                if (set.contains(i)) {
                    mat[i][j]=0;
                }
                if (set.contains(j))
                {
                    mat[i][j]=0;
                }
            }
        }*/
        return  mat;
    }
    public static void main(String[] args) {
        int row=3,col=3;
        int[][] mat={{1,1,0},{1,0,1},{1,1,1}};
        //int[][] mat={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] result=getMatrix(mat,row,col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
