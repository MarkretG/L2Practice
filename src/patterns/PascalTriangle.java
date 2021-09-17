package patterns;
public class PascalTriangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            int c=1;
            for (int k=1;k<=i;k++)
            {
                System.out.print(c+" ");
                c=c*(i-k)/k;
            }
            System.out.println();

        }
    }
}
