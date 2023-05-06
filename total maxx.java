import java.util.*;
class Maxx
{
    public static void main(String arr[])
    {
        Scanner ss=new Scanner(System.in);
        float hindi,english,math,total,per;

        System.out.println("Enter Hindi maxx:");
        hindi=ss.nextFloat();

        System.out.println("Enter english maxx:");
        english=ss.nextFloat();

        System.out.println("Enter math maxx:");
        math=ss.nextFloat();

        total=hindi+english+math;
        per=total/3;
   
        System.out.println("Total maxx="+total);

        System.out.println("Total persantage="+per);

        
    }
}