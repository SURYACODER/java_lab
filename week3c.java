import java.util.Scanner;
public class week3c {
    static void diagsum(int a[][], int m, int n){
        int sum1 = 0,sum2 = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    sum1 += a[i][j];
                }
                if(i+j==n-1){
                    sum2 += a[i][j];
                }
            }

        }
        System.out.println("Principal diaognal sum is "+sum1);
        System.out.println("Secondary diaognal sum is "+sum2);
        if(sum1>sum2){
            System.out.println("Difference is "+(sum1-sum2));
        }
        else{
            System.out.println("Difference is "+(sum2-sum1));
        }
    }
    public static void main(String s[]){
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
         diagsum(a,m,n);
         sc.close();
    }
}
