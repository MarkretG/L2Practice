package patterns;

public class Triangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            if(i==n)
            {
                for(int k=0;k<2*i-1;k++)
                    System.out.print("*");
            }
            else {
                for (int k = 1; k <=2 * i - 1; k++) {
                    if (k == 1 || k == (2 * i - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.println();
        }
    }
}
