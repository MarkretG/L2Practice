/**input:"aba"
output:a,b,c,aba.... count=4
*/

package strings;
public class AllPalindrome {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            count++;
            char temp=str.charAt(i);
            for(int j=i+1;j<str.length();j++)
            {
                if(temp==str.charAt(j))
                {
                    String str1=str.substring(i,j+1);
                    StringBuilder sb=new StringBuilder(str1);
                    String rev=new String(sb.reverse());
                    if(str1.equals(rev))
                    {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
