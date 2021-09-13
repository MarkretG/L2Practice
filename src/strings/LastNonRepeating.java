/**
input:dhatchinamoorthi
output:r
*/

package strings;
import java.util.ArrayList;
import java.util.List;
public class LastNonRepeating {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        List<Character> list=new ArrayList<>();
        for(int i=str.length()-1;i>=0;i--)
        {
            if(list.contains(str.charAt(i)))
            {
               continue;
            }
            int count=0;
            for(int j=i-1;j>=0;j--)
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    list.add(str.charAt(i));
                    count++;
                    break;
                }
            }
            if (count==0) {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
