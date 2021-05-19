import java.util.Scanner;
class sum_even{
	public static void main(String args[]){
		int a[]=new int[100];
        int sum_even=0,sum_odd=0,i,j;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of Array:");
		j = s.nextInt();
        System.out.println("Enter elements of Array:");
		for(i=0;i<j;i++){
            a[i]=s.nextInt();
        }
        for(i=0;i<j;i++){
            if(a[i]%2==0){
                sum_even=sum_even+a[i];
            }
            else{
                sum_odd+=a[i];
            }
        }
        System.out.println("Sum of even numbers is "+sum_even+" and odd numbers is "+sum_odd);
	}
}