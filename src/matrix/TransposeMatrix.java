/**
Input:
        N = 4
        mat[][] = {{1, 1, 1, 1},
        {2, 2, 2, 2}
        {3, 3, 3, 3}
        {4, 4, 4, 4}}
        Output:
        {{1, 2, 3, 4},
        {1, 2, 3, 4}
        {1, 2, 3, 4}
        {1, 2, 3, 4}}
        */

package matrix;
public class TransposeMatrix {
        private static int[][] transposeMatrix(int[][] mat,int n)
        {
                for(int i=0;i<n;i++)
                {
                        for(int j=i;j<n;j++)
                        {
                                if(i!=j)
                                {
                                        int temp=mat[i][j];
                                        mat[i][j]=mat[j][i];
                                        mat[j][i]=temp;
                                }
                        }
                }
                return  mat;
        }
        public static void main(String[] args) {
                int n = 3;
                int[][] mat={{1, 1, 1},
                        {2, 2, 2},
                        {3, 3, 3},
                        {4, 4, 4}};
                int[][] result=transposeMatrix(mat,n);
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
