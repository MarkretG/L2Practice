package arrays;
import java.util.Scanner;
public enum ArrayUtil {
    INSTANCE;
    private Scanner scanner=new Scanner(System.in);
    public int[] getArray()
    {
        int size=scanner.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=scanner.nextInt();
        }
        return arr;
    }
    public int getInput()
    {
        int num=scanner.nextInt();
        return  num;
    }
}
