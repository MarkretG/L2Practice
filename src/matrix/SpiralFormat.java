/**
 * spiral elements
  int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
  output:[1, 2, 3, 6, 9, 8, 7, 4, 5]
 */

package matrix;
import java.util.Arrays;
public class SpiralFormat {
    private static int[] getElements(int[][] mat,int row,int col)
    {
        int m=0;
        int[] arr=new int[row*col];
        int rowStart=0,rowEnd=row-1;
        int colStart=0,colEnd=col-1;
        while (rowStart<=rowEnd &&  colStart<=colEnd) {

            for (int i = rowStart; i <= colEnd; i++) {
                arr[m++] = mat[colStart][i];
            }
            colStart++;
            for (int i = colStart; i <=rowEnd; i++) {
                arr[m++] = mat[i][colEnd];
            }
            colEnd--;
            for (int j = colEnd; j >= rowStart; j--) {
                arr[m++] = mat[rowEnd][j];
            }
            rowEnd--;
            for (int j = rowEnd; j >= colStart; j--) {
                arr[m++] = mat[j][rowStart];
            }
            rowStart++;
        }
        //System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[] args) {
        int row=3,col=3;
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};
        int[] result=getElements(mat,row,col);
        System.out.println(Arrays.toString(result));
    }
}
