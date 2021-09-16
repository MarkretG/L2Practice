

package strings;
public class EncodeString {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        int num=0;
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='[')
            {
                int count=str.charAt(i-1)-48;
                String temp="";
                for (int j=i+1;j<str.length();j++)
                {
                    int flag=0;
                    String temp1="";
                      if(str.charAt(j)=='[') {
                          num = str.charAt(j - 1) - 48;
                         for (int m = j + 1; m < str.length(); m++) {
                             if (str.charAt(m) == ']') {
                                 flag=1;
                                 i = m - 1;
                                 j=m;
                                 break;
                             }
                             if (str.charAt(m) >= 97 && str.charAt(m) <= 122) {
                                 temp1 += str.charAt(m);
                             }
                         }
                        }
                      if(str.charAt(j)>=97&&str.charAt(j)<=122)
                      {
                        temp+=str.charAt(j);
                      }
                     if (flag==1)
                     {
                        for (int k = 0; k < num; k++) {
                            temp += temp1;
                        }
                    }
                       if(flag!=1&&str.charAt(j)==']')
                          {
                              for (int k=0;k<count;k++)
                              {
                                  result+=temp;
                              }
                              i=j;
                          }
                }


            }
            else if(str.charAt(i)>=97&&str.charAt(i)<=122)
            {
                result+=str.charAt(i);
            }
        }
        System.out.println(result);

    }
}
