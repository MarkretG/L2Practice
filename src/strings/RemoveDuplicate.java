/**
input:geeksforgeeks
output:efgkors
 */

package strings;
import java.util.ArrayList;
import java.util.List;
public class RemoveDuplicate {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        List<Character> list=new ArrayList<>();
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if (list.contains(str.charAt(i)))
            {
                continue;
            }
            result+=str.charAt(i);
            for (int j=i+1;j<str.length();j++)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    list.add(str.charAt(i));
                    break;
                }
            }
        }
        System.out.println(result);
        //sorting
        char[] ch=result.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            for (int j=0;j<ch.length-1;j++)
            {
                if (ch[j]>ch[j+1])
                {
                    char temp=ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        }
        System.out.println(ch);
    }
}
