import java.util.Scanner;
class Box
{
    double width;
    double height;
    double depth;
    Box(double wid, double hei, double dep)
    {
        System.out.println("Constructing Box");
        width = wid;
        height = hei;
        depth = dep;
    }
    double volume()
    {
        return width * height * depth;
    }


    public static void main(String args[])
    {   
        double l,b,h;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of box1 :");
        l = sc.nextDouble();
        System.out.println("enter breadth of box1 :");
        b = sc.nextDouble();
        System.out.println("enter heigth of box1 :");
        h = sc.nextDouble();
        Box box1 = new Box(l,b,h);        
        System.out.println("enter length of box2 :");
        l = sc.nextDouble();
        System.out.println("enter breadth of box2 :");
        b = sc.nextDouble();
        System.out.println("enter heigth of box2 :");
        h = sc.nextDouble();
        Box box2 = new Box(l,b,h);
        double vol;
        
        vol = box1.volume();
        System.out.println("Volume of the first box is " + vol);
        vol = box2.volume();
        System.out.println("Volume of the second box is " + vol);
        
    }
}