import java.util.*;
class Chandu
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,i=1,prime=0;
        System.out.print("enter number");
        n=s.nextInt();

        while(i<=n)
        {
            if(n%2==0)
            {
                prime++;

            }
            i++;
        }if(prime==0)
        {
            System.out.print("Prime");
        }else
        {
            System.out.print("Not prime");
        }
    }
}