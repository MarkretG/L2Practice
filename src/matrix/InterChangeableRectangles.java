/**
You are given n rectangles represented by a 0-indexed 2D integer array rectangles, where rectangles[i] = [widthi, heighti] denotes the width and height of the ith rectangle.

Two rectangles i and j (i < j) are considered interchangeable if they have the same width-to-height ratio. More formally, two rectangles are interchangeable if widthi/heighti == widthj/heightj (using decimal division, not integer division).

Return the number of pairs of interchangeable rectangles in rectangles.



Example 1:

Input: rectangles = [[4,8],[3,6],[10,20],[15,30]]
Output: 6
Explanation: The following are the interchangeable pairs of rectangles by index (0-indexed):
- Rectangle 0 with rectangle 1: 4/8 == 3/6.
- Rectangle 0 with rectangle 2: 4/8 == 10/20.
- Rectangle 0 with rectangle 3: 4/8 == 15/30.
- Rectangle 1 with rectangle 2: 3/6 == 10/20.
- Rectangle 1 with rectangle 3: 3/6 == 15/30.
- Rectangle 2 with rectangle 3: 10/20 == 15/30.
 */
package matrix;

import java.util.ArrayList;
import java.util.List;

public class InterChangeableRectangles {
    public static void main(String[] args) {
        List<Float> res=new ArrayList<>();
        int[][] mat={{4,8},{3,6},{10,20},{15,30}};
        for(int[] row:mat)
        {
           float val=(float) row[0]/row[1];
           res.add(val);
        }
        System.out.println(res);
        int count=0;
        for (int i=0;i<res.size();i++)
        {
            float val=res.get(i);
            for(int j=i+1;j< res.size();j++)
            {
                if(val== res.get(j))
                {
                   count++;
                }
            }
        }
        System.out.println(count);
    }
}
