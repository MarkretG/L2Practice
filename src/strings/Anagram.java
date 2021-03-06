package strings;
import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        int n=5;
        String[] str=new String[n];
        Map<String, List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            str[i]=StringUtil.INSTANCE.getInputString();
        }
        for(int i=0;i< str.length-1;i++)
        {
            if(str[i].equals("visited"))
            {
                continue;
            }
            String temp=str[i];
            char[] ch=str[i].toCharArray();
            Arrays.sort(ch);
            String sortedString=new String(ch);

            for (int j=i+1;j< str.length;j++)
            {
                if(temp.length()!=str[j].length())
                {
                    continue;
                }
                String temp1=str[j];
                char[] chars=str[j].toCharArray();
                Arrays.sort(chars);
                String current=new String(chars);
                if(sortedString.equals(current))
                {
                    str[j]="visited";
                    List<String> list=map.getOrDefault(temp,new ArrayList<>());
                    list.add(temp1);
                    map.put(temp,list);
                    //System.out.print(temp+" "+temp1);
                }
            }
        }
        System.out.println(map);
    }
}
