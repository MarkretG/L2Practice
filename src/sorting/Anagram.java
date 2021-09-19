package sorting;
import java.util.Arrays;
public class Anagram {
    private static boolean isTwoStringAnagram(String str,String str1)
    {
        if(str.length()!=str1.length())
        {
            return false;
        }
        char[] ch=str.toCharArray();
        char[] ch1=str1.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        for(int i=0;i<str.length();i++)
        {
            if(ch[i]!=ch1[i])
            {
                return false;
            }
        }
        return true;
       /* Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        if(str.length()!=str1.length())
        {
            return false;
        }
        for(int i=0;i<str.length();i++)
        {
            if(!map1.containsKey(str.charAt(i)))
            {
                map1.put(str.charAt(i),1);
            }
            else {
                map1.put(str.charAt(i), map1.get(str.charAt(i))+1);
            }
        }
        System.out.println(map1);

        for(int i=0;i<str.length();i++)
        {
            if(!map2.containsKey(str1.charAt(i)))
            {
                map2.put(str1.charAt(i),1);
            }
            else {
                map2.put(str1.charAt(i), map2.get(str1.charAt(i))+1);
            }
        }
        System.out.println(map2);
        for (int i=0;i<str1.length();i++)
        {
            char a=str.charAt(i);
            if(map1.get(a)!=map2.get(a))
            {
                return false;
            }
        }
        return true;*/
    }
    public static void main(String[] args) {
        String str="b";
        String str1="d";
        boolean result=isTwoStringAnagram(str,str1);
        System.out.println(result);
    }
}
