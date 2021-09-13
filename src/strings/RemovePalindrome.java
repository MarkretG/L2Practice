/**
input:"He did a good deed"
output:"He did"
 */
package strings;
public class RemovePalindrome{
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        String[] input=str.split(" ");
        int k=0;
        for(int i=0;i<input.length;i++)
        {
            String s=input[i];
            StringBuilder sb=new StringBuilder(s);
            String rev=new String(sb.reverse());
            if(!s.equals(rev))
            {
                input[k++]=input[i];
            }
        }
        for (int i=0;i<k;i++)
            System.out.print(input[i]+" ");
    }
}
