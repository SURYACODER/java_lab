import java.util.Scanner;
class Array{
	public static void main(String args[]){
		int a[]=new int[100];
        int sum=0,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array:");
		j = s.nextInt();
        System.out.println("Enter elements of Array:");
		for(i=0;i<j;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<j;i++){
            sum+=a[i];
        }
        int avg= sum/j;
        System.out.println("Sum is "+sum+" average is "+avg);
	}
}