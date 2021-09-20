/**
String str="computer";
        String str2="cat";
        o/p:ompuer
 */

package strings;
import java.util.HashSet;
import java.util.Set;

public class Remove {
    private static String removeSubStringCharacter(String str,String str2)
    {
        String res="";
       Set<Character> set=new HashSet<>();
        for(int i=0;i<str2.length();i++)
        {
            set.add(str2.charAt(i));
        }
        for(int i=0;i<str.length();i++)
        {
            if(!set.contains(str.charAt(i)))
            {
                res+=str.charAt(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str="occurrence";
        String str2="car";
        String res=removeSubStringCharacter(str,str2);
        System.out.println(res);

    }
}
