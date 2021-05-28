import java.util.Scanner;
class week5a
{
    static void divideString(String str, int n)
    {
    int str_size = str.length();
    int part_size = n ;
    if (str_size % n != 0)
    {
        System.out.println("Invalid Input: String size" +
                                "is not divisible by n");
        return;
    }    
    for (int i = 0; i< str_size; i++)
    {
        if(i % part_size == 0)
            System.out.println();
        System.out.print(str.charAt(i));
    }
    }
    public static void main(String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter the String : ");
        str = s.nextLine();
        System.out.print("Enter a number : ");
        n = s.nextInt();
        divideString(str, n);
    }
}