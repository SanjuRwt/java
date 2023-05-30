import java.util.*;
class CC
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a,b,sum=0;
        System.out.println("Enter 1st number");
        a=s.nextInt();

        System.out.println("Enter 2nd number");
        b=s.nextInt();
        
        fun(a,b);
    }
    static void fun(int x,int y)
    {
      if(x>y)
      {
        System.out.println(x);
      }
      else
      {
        System.out.println(y);
      }
    }
}