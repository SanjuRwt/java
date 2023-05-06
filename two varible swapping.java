import java.util.*;
class Swapp
{
    public static void main(String arr[])
    {
        Scanner ss=new Scanner(System.in);
        int a,b;
        System.out.println("Before swpping:");
        System.out.print("Enter 1st number:");
        a=ss.nextInt();

        System.out.print("Enter 2nd number:");
        b=ss.nextInt();

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swpping:");
        System.out.println(a);
        System.out.println(b);
    }
}