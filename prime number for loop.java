import java.util.*;
class Prime
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i,prime=0;
        System.out.print("Enter number");
        n=s.nextInt();

        for(i=1;i<=n;i++)
        {
            if(n%2==0)
            {
                prime++;
            }
        }
        if(prime==0)
        {
            System.out.print("prime");
        }else
        {
            System.out.print(" not prime");
        }
    }
}