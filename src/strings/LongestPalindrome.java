/**
input:appaammamalayalam
output:malayalam;
 */
package strings;
public class LongestPalindrome {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        if(str.equals(sb.reverse().toString())) {
            System.out.println(str);
            return;
        }
        String palindrome="";
        int len=0;
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            for (int j=i+1;j<str.length();j++)
            {
                if(str.charAt(j)==ch) {
                    String temp = str.substring(i, j + 1);
                    StringBuilder s = new StringBuilder(temp);
                    String rev=new String(s.reverse());
                    if (temp.equals(rev)) {
                        if(temp.length()>len)
                        {
                            len=temp.length();
                            palindrome=temp;
                        }
                    }
                }
            }
        }
        System.out.println(palindrome);
    }
}
