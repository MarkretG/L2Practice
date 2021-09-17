package patterns;

import java.util.ArrayList;
import java.util.List;

public class LookAndSaySequence {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        int n=5;
        String str="1";
        System.out.println(str);
        int i=1;
        while (i<n)
        {
            String newStr="";
            int count=1;
            char a=str.charAt(0);
            for (int j=1;j<str.length();j++)
            {
                if(str.charAt(j)!=str.charAt(j-1))
                {
                    newStr+=count+""+a;
                    a=str.charAt(j);
                    count=1;
                }
                else {
                    count++;
                }
            }
            newStr+=count+""+a;
            str=newStr;
            list.add(str);
            i++;
            for (int k=0;k<str.length();k++)
            {
                System.out.print(str.charAt(k)+" ");
            }
            System.out.println();
        }

        System.out.println(list.get(n-2));
    }

}
