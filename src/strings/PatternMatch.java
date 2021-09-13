/**
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Example 2:

Input: pattern = "abba", s = "dog cat cat fish"
Output: false
 */
package strings;
import java.util.HashMap;
import java.util.Map;
public class PatternMatch {
    private static boolean wordPattern(String pattern,String str)
    {
        Map<Character,String> map=new HashMap<>();
        String[] words=str.split(" ");
        if(pattern.length()!= words.length)
        {
            return false;
        }
        for(int i=0;i<pattern.length();i++)
        {
            char ch=pattern.charAt(i);
            String word=map.get(ch);
            if(word==null)
            {
                if(map.containsValue(words[i]))
                {
                    return false;
                }
                map.put(ch,words[i]);
            }
            else  if(!word.equals(words[i]))
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern=StringUtil.INSTANCE.getInputString();
        String str=StringUtil.INSTANCE.getInputString();
        boolean result=wordPattern(pattern,str);
        System.out.println(result);
    }
}
