import java.util.*;
class Unit
{
    public static void main(String afr[])
    {
        Scanner s=new Scanner(System.in);
        int unit,multi;
        System.out.print("Enter unit:");
        unit=s.nextInt();

        if(unit<=50)
        {
            multi=0;
            System.out.println(multi);
        }else if(unit>=50 && unit<=200 )
        {
            multi=unit*5;
            System.out.println("your balance"+multi);
        }
        else if(unit>=200 && unit<=500)
        {
            multi=unit*8;
            System.out.println("your balance"+multi);
        }else 
        {
            multi=unit*10;
            System.out.println("your balance"+multi);
        }
    }
}