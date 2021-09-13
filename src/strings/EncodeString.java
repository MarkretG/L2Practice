package strings;
public class EncodeString {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        for(int i=0;i<str.length();i++)
        {
            String temp="";
            if(str.charAt(i)=='[')
            {
                int count=str.charAt(i-1)-48;
                for (int j=i+1;j<str.length();j++)
                {

                    if(str.charAt(j)=='[')
                    {
                        for (int m=j+1;m<str.length();m++)
                        {
                            if(str.charAt(m)==']')
                            {
                                break;
                            }
                            temp+=str.charAt(j);
                        }
                    }
                    if(str.charAt(j)==']')
                    {
                        break;
                    }
                    temp+=str.charAt(j);
                }
                for (int k=0;k<count;k++)
                    System.out.print(temp);
            }
        }
    }
}
