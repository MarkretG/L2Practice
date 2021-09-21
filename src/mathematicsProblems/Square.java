/**
 * Input:
 * x1 = 20, y1 = 10, x2 = 10, y2 = 20,
 * x3 = 20, y3 = 20, x4 = 10, y4 = 10
 * Output:
 * Yes
 * Explanation:
 * The points (20,10), (10,20), (20,20),
 * (10,10) forms a square.

 */

package mathematicsProblems;
public class Square {
    private static String isSquare(int x1,int y1,int x2,int y2,int x3,int y3,int x4,int y4)
    {
        if(x1==x3&&y1==y3&&x2==x4&&y2==y4)
            return "No";
        if(Math.abs(x1-x3)==Math.abs(x2-x4)&&Math.abs(y1-y3)==Math.abs(y2-y4))
        {
            return "Yes";
        }
        return "No";
    }
    public static void main(String[] args) {
       int x1 = 20, y1 = 10, x2 = 10, y2 = 20,
        x3 = 20, y3 = 20, x4 = 10, y4 = 10;
       isSquare(x1,y1,x2,y2,x3,y3,x4,y4);
    }
}
