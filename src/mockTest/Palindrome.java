package mockTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {
    static List<Integer> palindrome=new ArrayList<>();
    private static int reverse(int num)
    {
        int reverse=0;
        while (num>0)
        {
            reverse=(reverse*10)+num%10;
            num=num/10;
        }
       return reverse;
    }
    private static void initialisePalindrome()
    {
        int count=0;
        for (int i=11;i<100000;i++)
        {
            if(count==10000)
            {
                break;
            }
            count++;
            int num1=i;
            int num2=reverse(num1);
            if(num1==num2)
            {
                palindrome.add(num1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int num=Integer.parseInt(str);
        initialisePalindrome();
        System.out.println("list of palidrome:"+palindrome);
        int ans= palindrome.get(num-1);
        System.out.println(ans);
    }
}
