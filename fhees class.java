import java.util.*;
class Fhees
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int c,f=0,choice,month;
        System.out.print("Enter your Class:");
        c=s.nextInt();

        System.out.print("Enter Month:");
        month=s.nextInt();
      
       

        f=c*month*100;
        System.out.print("fess="+f);

    }
}