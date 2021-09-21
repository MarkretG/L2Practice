/**
input:
str1="sunday" str2="saturday"
output:3

input:
str1="geek" str2="gesek"
output:1
*/
package strings;
public class EditDistance {
    private static int min(int x,int y,int z)
    {
        if(x<=y&&x<=z)
            return x;
        if(y<=x&&y<=z)
            return y;
        else {
            return z;
        }
    }
    private static int getEditDis(String str1,String str2,int m,int n)
    {
        if(m==0)
        {
            return n;
        }
        if(n==0)
        {
            return m;
        }
        if(str1.charAt(m-1)==str2.charAt(n-1))
        {
            return getEditDis(str1,str2,m-1,n-1);
        }
        return 1+min(getEditDis(str1,str2,m,n-1),//insert
                     getEditDis(str1,str2,m-1,n),//remove
                     getEditDis(str1,str2,m-1,n-1));//replace

    }
    public static void main(String[] args) {
        String str1="welcome";
        String str2="seltos";
        int result=getEditDis(str1,str2,str1.length(),str2.length());
        System.out.println(result);
       /* String str1 = StringUtil.INSTANCE.getInputString();
        String str2 = StringUtil.INSTANCE.getInputString();
        int count = 0;
        if (str1.equals(str2)) {
            System.out.println(count);
            System.out.println("two strings are equal no operation needed");
            return;
        }
        int i = 0;
        while (i < str2.length()) {
            int index = str1.indexOf(str2.charAt(i));
            if (index != -1) {
                String tem = "";
                tem += str1.substring(0, index);
                tem += str1.substring(index + 1);
                str1 = tem;
            } else {
                count++;
            }
            i++;
        }
        System.out.println(count);*/

    }
}
