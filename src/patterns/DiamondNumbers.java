/*
n=4
  1
 212
32123
4321234
 32123
  212
   1
 */
package patterns;
public class DiamondNumbers {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int count=0;
            for (int j=0;j<n-i;j++)
                System.out.print(" ");
            for (int k=1;k<=2*i-1;k++)
            {
                System.out.print(temp);
                if(temp>1&&count==0)
                {
                    temp--;
                }
                else
                {
                    count=1;
                    temp++;
                }
            }
            System.out.println();
        }

        for(int i=n-1;i>=1;i--)
        {
            int temp=i;
            int count=0;
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++)
            {
                System.out.print(temp);
                if(temp>1&&count==0)
                {
                    temp--;
                }
                else {
                    count++;
                    temp++;
                }
            }
            System.out.println();
        }
    }
}
