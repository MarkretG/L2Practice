/**
input:hello fox foxhello
replace:fox
result:cat
output:hello cat cathello
*/
package strings;
public class Replace {
    public static void main(String[] args) {
        String input=StringUtil.INSTANCE.getInputString();
        String replaceString=StringUtil.INSTANCE.getInputString();
        String resultString=StringUtil.INSTANCE.getInputString();
        char[] ch=input.toCharArray();
               for(int i=0;i<ch.length;i++)
                {
                    int count=0;
                    for (int j=0;j<replaceString.length();j++)
                    {
                        if((j+j)<ch.length&&ch[i+j]==replaceString.charAt(j))
                        {
                           count++;
                        }
                        else {
                            break;
                        }
                    }
                    if(count==replaceString.length())
                    {
                        for (int m=0;m<resultString.length();m++)
                        {
                          ch[i++]=resultString.charAt(m);
                        }
                    }
                }
               String result=new String(ch);
        System.out.println(result);
    }
}
