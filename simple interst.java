import java.util.*;
class Interst
{
    public static void main(String aaa[])
    {
        Scanner ss=new Scanner(System.in);
        float p,r,t,si;
        System.out.println("Enter Princpal amount");
        p=ss.nextFloat();

        System.out.println("Enter Rate");
        r=ss.nextFloat();

        System.out.println("Enter Time");
        t=ss.nextFloat();
        
        si=p*r*t/100;
        System.out.println("Total interst="+si);

    }
}