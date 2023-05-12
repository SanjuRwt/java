import java.util.*;
class Fact
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int n,fact=1,i;
        System.out.print("Enter number");
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.print(fact);
    }
}