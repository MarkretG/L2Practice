package strings;
public class RemoveConsecutive {
    private static String recursiveCall(String str,int k)
    {
        char ch=' ';int count=1;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
            {
                count++;
            }
            else {
                count=1;
            }
            if(count==k)
            {
                return str.substring(0,i-k+1)+str.substring(i+1);
            }
            ch=str.charAt(i);
        }
        return str;
    }
    private static String getReducedAfterRemovingConsective(String str,int k)
    {
        while (true)
        {
            String res=recursiveCall(str,k);
            if(res.equals(str))
            {
                return res;
            }
            str=res;
        }
    }
    public static void main(String[] args) {
        String str="geegsforgeeeks";
        int k=2;
        String res=getReducedAfterRemovingConsective(str,k);
        System.out.println(res);
    }
}
