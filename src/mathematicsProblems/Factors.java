package mathematicsProblems;
public class Factors {
    private static long findCountOfOddFactorsNumber(int num)
    {
        long count = 0;
        for(int i =1;i<=num;i++){
            double n = Math.sqrt(i);
            //perfect square numbers are have odd number of factors
            if(n*n==i){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=10;
        long result=findCountOfOddFactorsNumber(n);
        System.out.println(result);
    }
}
