package patterns;
public class sandGlassPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
