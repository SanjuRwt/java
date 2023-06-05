// Area of circle PI*r*r;
// PI=22/7=3.14;
import java.util.Scanner;
class Areaofcircle
{
    public static void main(String[] args) {
        double PI=3.14,Area;
        int r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Redious:");
        r=s.nextInt();

        Area=PI*r*r;
        System.out.println("Area of Circle="+Area);
    }
}