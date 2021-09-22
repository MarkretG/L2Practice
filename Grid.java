public class Grid {
    private static void findStartIndex(char[][] grid,int n,String word)
    {
        //horizontal left
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int count=0;
                if(grid[i][j]==word.charAt(0))
                {
                    for (int c=j,k=0;c<n&&k<word.length();c++,k++)
                    {
                        if(grid[i][c]==word.charAt(k))
                        {
                            count++;
                        }
                        if(count==word.length())
                        {
                            System.out.println("index found at:"+"("+i+","+j+")");
                            break;
                        }
                    }
                }
            }
        }

        ///down
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int count=0;
                if(grid[i][j]==word.charAt(0))
                {
                    for (int c=i,k=0;c<n&&k<word.length();c++,k++)
                    {
                        if(grid[c][j]==word.charAt(k))
                        {
                            count++;
                        }
                        if(count==word.length())
                        {
                            System.out.println("index found at:"+"("+i+","+j+")");
                            break;
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int n=3;
       char[][] grid = {{'a','b','c'},
                        {'d','e','f'},
                        {'g','h','i'}};
       String word="def";
       findStartIndex(grid,n,word);


    }
}
