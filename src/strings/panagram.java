package strings;

import java.util.HashSet;
import java.util.Set;

public class panagram {
    private static boolean isPanagram(String str)
    {
        if(str.length()<26)
        {
            return false;
        }
        Set<Character> set=new HashSet<>();
        for (int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        return set.size()==26;
    }
    public static void main(String[] args)
    {
        String str="mnbvcxzasdfghjklpoiuytrewq";
        boolean result=isPanagram(str);
        System.out.println(result);
    }
}
