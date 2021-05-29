import java.util.Scanner;
class DiagonalMatrix
 {
    static int MAX = 100;
    static void printPrincipalDiagonal(int mat[][], int m,int n)
    {
        System.out.print("Principal Diagonal: ");
 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
    static void printSecondaryDiagonal(int mat[][], int m,int n)
    {
        System.out.print("Secondary Diagonal: ");
 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) == (n - 1)) {
                    System.out.print(mat[i][j] + ", ");
                }
            }
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        int m,n,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        m = sc.nextInt();
        System.out.println("enter no of columns");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("enter no of elements in the matrix");
        for(i=0;i<m;i++) {
          for(j=0;j<n;j++)
             {
          a[i][j]=sc.nextInt();
             }
                          
         }
        printPrincipalDiagonal(a, m, n);
        printSecondaryDiagonal(a, m, n);
    }
}
