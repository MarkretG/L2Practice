/**
 Input:
 row = 3, col = 4
 M[][] = {{1 1 0 1},{1 0 0 1},{1 1 0 1}}
 Output: 1 1 0 1 $1 0 0 1 $
 Explanation: Above the matrix of size 3x4
 looks like
 1 1 0 1
 1 0 0 1
 1 1 0 1
 The two unique rows are 1 1 0 1 and
 1 0 0 1 .
 */

package matrix;
import java.util.ArrayList;
public class UniqueRows {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c)
    {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();

        for(int[] row: a){
            ArrayList<Integer> x=new ArrayList<>();
            for (int i = 0; i < row.length; i++) {
                x.add(row[i]);
            }
            System.out.println(x);
            if(!res.contains(x)){
                res.add(x);
                System.out.println(res);
            }
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args) {
        int row=3,col=4;
        int[][] mat={{1,1,0,1},{1,0,0,1},{1,1,0,1}};
        ArrayList<ArrayList<Integer>> arr = uniqueRow(mat,row,col);
        for(int i = 0;i<arr.size();i++){
            ArrayList<Integer> demo = arr.get(i);
            for(int j = 0;j<demo.size();j++){
                System.out.print(demo.get(j)+" ");
            }
            System.out.print("$");
        }
        System.out.println();
    }

    }
