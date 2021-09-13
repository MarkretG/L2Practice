/**
input:"hi hello how are you     "
output:3
 */

package strings;
public class MaximalSubString {
    public static void main(String[] args) {
        String str=StringUtil.INSTANCE.getInputString();
        int count=0;
        for (int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ') {
                count++;
                if (i != 0 && str.charAt(i - 1) == ' ')
                    break;
            }
        }
        System.out.println(count);
    }
}
