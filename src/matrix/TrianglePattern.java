package matrix;

public class TrianglePattern {
    public static void main(String[] args) {
        int n=5;
        int left=n,right=n;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n*2;j++)
            {
                if(j==left||j==right)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            left--;
            right++;
            System.out.println("");
        }
    }
}
