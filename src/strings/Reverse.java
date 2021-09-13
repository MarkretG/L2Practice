/**
input:Hello this is the CFG user
output:user eht si siht olleH
 */
package strings;
public class Reverse {
    private static String reverse(String str)
    {
        String rev="";
        for(int i= str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        String[] s=str.split(" ");
        String result="";
        for (int i=s.length-1;i>=0;i--)
        {
            if(i==0||i==s.length-1)
            {
                result+=s[i]+" ";
            }
            else
            {
                result+=reverse(s[i])+" ";
            }
        }
        System.out.println(result);
    }
}
