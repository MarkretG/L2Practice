/**
        String str="practice";

        o/p:prectica
 */
package strings;
public class ReversingVowels {
    private static boolean isVowel(char c)
    {
        return (c=='a'||c=='e'||c=='i'||c=='o'||c=='u');
    }
    private static  String reversingVowels(String  str)
    {
        char[] ch=str.toCharArray();
        int i=0,j=str.length()-1;
        while (i<j)
        {
            if(!isVowel(ch[i]))
            {
                i++;
                continue;
            }
            if(!isVowel(ch[j]))
            {
                j--;
                continue;
            }
            char temp=ch[i];
            ch[i] =ch[j];
            ch[j]=temp;
            i++;j--;
        }
        String res=new String(ch);
        return res;
    }
    public static void main(String[] args) {
        String str="practice";
        String res=reversingVowels(str);
        System.out.println(res);
    }
}
