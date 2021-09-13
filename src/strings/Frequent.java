/**
input:success
output:c  ......second most frequent character
 */


package strings;
import java.util.LinkedHashMap;
import java.util.Map;
public class Frequent {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        Map<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),0);
            }
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        }
        System.out.println(map);
        //O(n^2)
        /*int firstMax=0;
        char firstChar=0;
        int count=0;
        while(count<3)
        {
             firstMax=0;
             firstChar=0;
            for(Character key: map.keySet()) {
                int val = map.get(key);
                if (val > firstMax) {
                    firstMax = val;
                    firstChar=key;
                }
            }
            map.put(firstChar,-1);
            count++;

        }
        System.out.println(firstChar);

         */
        //o(n)
       int firstMax=0,secondMax=0;
        char firstChar=0,secondChar=0;
        for(Character key: map.keySet())
        {
            int val=map.get(key);
            if(val>firstMax)
            {
                secondMax=firstMax;
                firstMax=val;
                secondChar=firstChar;
                firstChar=key;
            }
            else {
                if (val>secondMax&&val<firstMax)
                {
                    secondMax=val;
                    secondChar=key;
                }
            }
        }
        System.out.println(secondChar);
    }
}
