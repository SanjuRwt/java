import java.util.*;
class st
{
    public static void main(String arg[])
    {
        Scanner sr=new Scanner(System.in);
        int h,e,m,s,p,total,per;

        System.out.print("Enter Hindi Subject Max:");
        h=sr.nextInt();

        System.out.print("Enter English Subject Max:");
        e=sr.nextInt();


        System.out.print("Enter Math Subject Max:");
        m=sr.nextInt();


        System.out.print("Enter Sinece Subject Max:");
        s=sr.nextInt();

        System.out.print("Enter Poltical Sinece Subject Max:");
        p=sr.nextInt();


        total=h+e+m+s+p;
        System.out.println("Total="+total);

        per=total/5;
        System.out.println("Persange="+per);

        if(per>=60)
        {
            System.out.println("1st Divson");
        }
        else if(per>=45)
        {
            System.out.println("2nd Divson");
        }
        else if(per>=36)
        {
            System.out.println("3rd Divson");
        }
        else 
        {
            System.out.println("Fail");
        }
    }
}