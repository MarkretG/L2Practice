/**
 * i.p:aebcbda
 * o/p:2
 *remove e,d

 */

package strings;
public class MinimumDeletionPalindrome {
    private static int deletion(String str,int i,int j)
    {
        if(i>=j)
        {
            return 0;
        }
        if(str.charAt(i)==str.charAt(j))
        {
            return deletion(str,i+1,j-1);
        }
        return 1+Math.min(deletion(str,i+1,j),deletion(str,i,j-1));
    }
    private static int getMinimumDeletion(String str)
    {
        return deletion(str,0,str.length()-1);
    }
    public static void main(String[] args) {
        String str="geeksforgeeks";
        int min=getMinimumDeletion(str);
        System.out.println(min);
    }
}
