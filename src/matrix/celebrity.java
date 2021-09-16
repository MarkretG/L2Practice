package matrix;

public class celebrity {
    private static  int findCelebrity(int[][] mat)
    {
        int i=0,j=mat.length-1;
        while(i<j)
        {
            if(mat[j][i]==1)  //j knows i
                j--;
            else
            {
                i++;
            }
        }
        int celebrity=i;
        //check he is actual celebrity
        for(int k=0;k<mat.length;k++)
        {
            if(k!=celebrity)
            {
                if(mat[k][celebrity]==0||mat[celebrity][k]==1)
                {
                    return -1;
                }
            }
        }
        return celebrity;
    }
    public static void main(String[] args) {
        int[][] mat={{0,1, 0},
                {0 ,0 ,0},
                {0 ,1 ,0}};
        int celebrity=findCelebrity(mat);
        System.out.println(celebrity);
    }
}
