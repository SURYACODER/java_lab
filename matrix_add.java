import java.util.Scanner;
class matrix_mul{
	public static void main(String args[]){
		int a[][]=new int[100][100];
        int b[][]=new int[100][100];
        int c[][]=new int[100][100];

        int i,j,k,r1,r2,c1,c2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter row and column size of first array:");
		r1 = s.nextInt();
        c1 = s.nextInt();
        System.out.println("Enter row and column size of second array:");
		r2 = s.nextInt();
        c2 = s.nextInt();

        if(c1==c2 && r1==r2){
            System.out.println("Enter elements of first array:");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    a[i][j]=s.nextInt();
                }
            }
            System.out.println("Enter elements of second array:");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++){
                    b[i][j]=s.nextInt();
                }
            }
            for(i=0;i<r1;i++){    
                for( j=0;j<c2;j++){    
                    c[i][j]=0;      
                    c[i][j]+=a[i][j]+b[i][j];      
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }

        }
        else{
            System.out.println("Matrix Addition is not possible");
        }
	}
}