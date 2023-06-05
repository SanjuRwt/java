//Area of triangle
//1.find semiperametor/2
//2.find Area

import java.util.Scanner;

class Areaoftriangle
{
    public static void main(String[] args) {
        int a,b,c,sp;
        double Area;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Tree side");
        a=s.nextInt();
        b=s.nextInt();
        c=s.nextInt();

        sp=(a+b+c)/2;

        Area=Math.sqrt(sp*(sp-a)*(sp-b)+(sp-c));
        System.out.println("Area of triangle"+Area);
    }
}