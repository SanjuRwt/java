import java.util.*;
class Argument
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 1st number:");
        a=s.nextInt();

        System.out.println("Enter 2nd number:");
        b=s.nextInt();

        Largest(a,b);
       int small= Minimum(a,b);                
        System.out.println("Smallest"+small);
    }static void Largest(int x,int y)
    {
        if(x>y)
        {
            System.out.println("max"+x);
        }
        else{
            System.out.println("max"+y);
        }
    }static int Minimum(int x,int y)
    {
       int  small=x<y?x:y;
        return(small);
    }
    
}