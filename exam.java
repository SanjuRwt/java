import java.util.*;
class Interst
{
    public static void main(String arr[])
    {
        Scanner sr=new Scanner(System.in);
        float p,r,t,si;

        p=sr.nextFloat();
        System.out.println("Enter Principal Amount:");

        r=sr.nextFloat();
        System.out.println("Enter Rate:");

        t=sr.nextFloat();
        System.out.println("Enter Time:");

        si=p*r*t/100;
        System.out.println("Total Insert="+si);
    }
}