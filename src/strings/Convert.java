/**
input:Hey How Are You
output:hEY hOW aRE yOU
*/

package strings;
public class Convert {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        char[] ch=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)>=65&&str.charAt(i)<=90)
            {
                ch[i]=(char)((int)str.charAt(i)+32);
            }
            if(str.charAt(i)>=97&&str.charAt(i)<122)
            {
                ch[i]=(char)((int)str.charAt(i)-32);
            }
            if(str.charAt(i)==32)
            {
                ch[i]=str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}
