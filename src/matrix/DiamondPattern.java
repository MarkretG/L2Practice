/**
n=9
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
 */

package matrix;
public class DiamondPattern {
    public static void main(String[] args) {
        int n=9;
        int printControl=n/2+1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(j==printControl||j==n-printControl+1)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            if(i<=n/2)
            {
                printControl--;
            }
            else {
                printControl++;
            }
            System.out.println(" ");
        }
    }
}
