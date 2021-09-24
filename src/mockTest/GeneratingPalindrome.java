package mockTest;/*
Jerry : 2
To Tom : 22
Jerry : 11
To Tom : 111
 */
import java.util.Scanner;
public class GeneratingPalindrome {
    Scanner scanner=new Scanner(System.in);
    private  String threeDigit(int num)
    {
        int tem=num;
        int res=0;
        String first="";
        int count=0;
        while (tem>0)
        {
            res=(res*10)+tem%10;

            if(count>=1&&tem%10!=0)
            {
                first+=tem%10;
            }
            tem=tem/10;
            count++;
        }
        System.out.println("first digits"+first);
        return first;
    }
    private  void generatePalindrome(int num)
    {
        int tem=num;
        int res=0;
        int count=0;
        int first=0;
        while (tem>0)
        {
            res=(res*10)+tem%10;
            first=tem%10;
            tem=tem/10;
            count++;
        }
        System.out.println("jerry:"+num);
        int ans = 0;
        if(num==res) {
            ans = (num * 10) + num % 10;
             System.out.println("To tom:"+ans);
        }
        else if(count==2){
            ans=(num*10)+first;
            System.out.println(ans);
        }
        else if(num>=100)
        {
            String a=threeDigit(num);
            System.out.println("**digits"+a);
            String n=String.valueOf(num);
            System.out.println("string values"+n);
            //ans=(num*10)+Integer.parseInt(a);
            System.out.println(n+""+a);
        }
        generatePalindrome(scanner.nextInt());
    }
    public static void main(String[] args) {
        GeneratingPalindrome generatingPalindrome=new GeneratingPalindrome();
        generatingPalindrome.generatePalindrome(10009);

    }
}
