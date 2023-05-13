import java.util.*;
class Fatoreal
{
    public static void main(String are[])
    {
        Scanner s=new Scanner(System.in);
        int n,f=1,i=1;
        System.out.print("enter number");
        n=s.nextInt();
        while(i<=n)
        {
            f=f*i;
           i++;
        }
        System.out.print(f); 
    }
}