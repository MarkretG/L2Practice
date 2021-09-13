/**
 input:10
 output:X
 */
package strings;
public class DecimalToRoman {
    public static void main(String[] args) {
        int number=58;
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        String result="";
        for(int i=0;i<values.length;i++)
        {
            while (number>=values[i])
            {
                number-=values[i];
                result+=roman[i];
            }
        }
        System.out.println(result);
    }
}
