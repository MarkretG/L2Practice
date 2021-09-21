/**
o(logn)

Input:
x = 5
Output: 2
Explanation: Since, 5 is not a perfect
square, floor of square_root of 5 is 2.
 */
package mathematicsProblems;
public class SquareRoot {
    private static int findSquareRoot(int num)
    {
        if(num==0||num==1)
        {
            return num;
        }
        int l=1,r=num,result=0;
        while (l<=r)
        {
            int mid=(l+r)/2;
            if(mid*mid==num)
            {
                return mid;
            }
            else if (mid*mid<num)
            {
                l=mid+1;
                result=mid;
            }
            else {
                r=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int num=40;
       /* float a = 2.5f;
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(a));*/
        int result=findSquareRoot(num);
        System.out.println(result);
    }
}
