/**

     *
    ***
   *****
  *******
 *********
  *******
   *****
    ***
     *
 */
package patterns;
public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        int m=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<m;k++)
            {
                System.out.print("*");
            }
            m+=2;
            System.out.println();
        }
        m=m-4;
        for(int i=1;i<=n-1;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<m;k++)
            {
                System.out.print("*");
            }
            m-=2;
            System.out.println();

        }
    }
}
