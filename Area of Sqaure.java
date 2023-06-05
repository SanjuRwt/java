// Area of Sqaure Area=side*side;

import java.util.Scanner;

class Sqaure
{
    public static void main(String[] args) {
        int side,Area;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter side");
        side=s.nextInt();
        Area=side*side;
        System.out.println("Area of Sqaure="+Area);
    }
}