/**
 Input:
 PROGRAM

 Output :
 P M
 R A
 O R
 G
 O R
 R A
 P M

 Input : ODD
 O D
 D
 O D
 */
package patterns;
public class OddLengthPattern {
    public static void main(String[] args) {
        String str="odd";
        int i=0,j=str.length()-1;
        while (i<=j)
        {
            if(i==j)
            {
                System.out.println(str.charAt(i));
                break;
            }
            else {
                System.out.println(str.charAt(i++) + "" + str.charAt(j--));
            }

        }
        int mid=(i+j)/2;
        i=mid-1;
        j=mid+1;
        while (i>=0&&j<=str.length()-1)
        {
            System.out.println(str.charAt(i--)+""+str.charAt(j++));
        }

    }
}
