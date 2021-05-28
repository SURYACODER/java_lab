import java.util.Scanner;
class Calculator {

    public static void main(String[] args) 
    {        
        double a,b;
        int c,d;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        a = sc.nextDouble();
        System.out.println("enter a number :");
        b = sc.nextDouble();
        System.out.println("enter a number :");
        c = sc.nextInt();
        System.out.println("enter a number :");
        d = sc.nextInt();
        System.out.println("Power of "+a+" "+b+" is "+Calculator.powerDouble(a,b));
        System.out.println("Power of "+c+" "+d+" is "+Calculator.powerInt(c,d));

    }
    static double powerInt(int num1,int num2)
    {
        int c=1,i;
        for(i=0;i<num2;i++){
            c = c*num1;
        }
        return c;
    }
    static double powerDouble(double num1,double num2)
    {        
        double c=1,i;
        for(i=0;i<num2;i++){
            c = c*num1;
        }
        return c;
    }
}
