/**
Sample Input: Matrix without sorting
        5 2 0 7 1
        3 4 2 9 14
        5 1 3 5 2
        4 2 6 2 1
        0 6 3 5 1
        Sample Output: Matrix after sorting
        1 2 0 7 1
        3 2 2 9 14
        5 1 3 5 2
        4 2 6 4 1
        0 6 3 5 5
*/

package matrix;
public class DiagonalMatrixSort {
    private  static  int[][] diagonalSort(int[][] mat,int n)
    {
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    arr[i]=mat[i][j];
                }
            }
        }
        sort(arr,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    mat[i][j]=arr[i];
                }
            }
        }
        return mat;
    }
    private static  void sort(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] mat = {{5, 2, 0, 7, 1},
                {3, 4, 2, 9, 14},
                {5, 1, 3, 5, 2},
                {4, 2, 6, 2, 1},
                {0, 6, 3, 5, 1}};
        int[][] result = diagonalSort(mat,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
