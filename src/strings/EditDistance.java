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
    public static void main(String[] args) {
        String str1 = StringUtil.INSTANCE.getInputString();
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
        System.out.println(count);

    }
}
