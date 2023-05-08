import java.util.*;
class Max
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);

        int a,b,c;
        System.out.print("Enter a number:");
        a=s.nextInt();
        System.out.print("Enter b number:");
        b=s.nextInt();
        System.out.print("Enter c number:");
        c=s.nextInt();
        
        if(a>b)
        {
            if(a>c)
            {
                System.out.print(a);
            }else
            {
                System.out.print(c);
            }
        }else
        {
            if(b>c)
            {
                System.out.print(b); 
            }
            else{
                System.out.print(c);
            }
        }
    }
}