package mockTest;
public class Search2DGrid {
    static int R=3,C=4;
    static int[] x={-1,-1,-1,0,0,1,1,1};
    static  int[] y={-1,0,1,-1,1,-1,0,1};
    private static boolean search2D(char[][] grid,int row,int col,String word)
    {
        if(grid[row][col]!=word.charAt(0))
        {
            return false;
        }
        int len=word.length();
        for(int dir=0;dir<8;dir++)
        {
            int k, rd=row+x[dir],cd=col+y[dir];
            for( k=1;k<len;k++)
            {
                if(rd<0||rd>=R||cd<0||cd>=C)
                {
                    break;
                }
                if(grid[rd][cd]!=word.charAt(k))
                {
                    break;
                }
                //particular direction move
                rd+=x[dir];
                cd+=y[dir];
            }
            //all character matched
            if(k==len)
            {
                return true;
            }
        }
        return false;

    }
private static void findWordIndex(char[][] grid,String word)
{
    for(int row=0;row<R;row++)
    {
        for(int col=0;col<C;col++)
        {
            if(search2D(grid,row,col,word))
            {
                System.out.println("start index:"+"("+row+","+","+col+")");
            }
        }
    }
}
    public static void main(String[] args) {
        char[][] grid={{'a','b','a','b'},
                       {'a','b','e','b'},
                       {'e','b','e','b'}};
            String word="abe";
            findWordIndex(grid,word);
    }
}
