/**
 * str="geeks for geeks"
 * o/p:gfg

 */

package strings;
public class FirstLetterString {
    private static String getAllWordsFirstLetter(String str)
    {
        String[] s=str.split(" ");
        String res="";
        for(int i=0;i<s.length;i++)
        {
            res+=s[i].charAt(0);
        }
        return res;
    }
    public static void main(String[] args) {
        String str="geeks for geeks";
        String res=getAllWordsFirstLetter(str);
        System.out.println(res);
    }
}
