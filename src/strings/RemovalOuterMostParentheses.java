/**
Input: S = “(((a)(bcd)(e)))”
        Output: (a)(bcd)(e)
        Explanation:
        The outermost enclosing brackets are: { S[0], S[1], S[13], S[14] }.
        Removing the outermost enclosing brackets from str modifies str to “(a)(bcd)(e)”.
        Therefore, the required output is (a)(bcd)(e).

        Input: str = “((ab)(bc))d”
        Output: ((ab)(bc))d
        Explanation:
        Since no outermost enclosing brackets present in the string. Therefore, the required output is ((ab)(bc))d
*/
package strings;
public class RemovalOuterMostParentheses {
    private static String getRemovalOutMostParentheses(String str)
    {
        char[] ch=str.toCharArray();
           int i=0,j=str.length()-1;
            if(!(ch[i]=='('&&ch[j]==')')) {
                return str;
            }
            while (i<j)
            {
                if((ch[i]=='('&&!(ch[i+1]>=97&&ch[i+1]<=122))&&(ch[j]==')'&&!(ch[j-1]>=97&&ch[j-1]<=122)))
                {
                    ch[i]='1';
                    ch[j]='1';
                }
                i++;
                j--;
            }
        return str;
    }
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        String result=getRemovalOutMostParentheses(str);
        System.out.println(result);
    }
}
