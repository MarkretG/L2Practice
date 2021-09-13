package strings;
import java.util.Scanner;
public enum StringUtil {
    INSTANCE;
    private Scanner sc=new Scanner(System.in);
    public  String getInputString()
    {
        String input=sc.nextLine();
        return input;
    }
}
