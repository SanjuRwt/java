import java.util.*;
class Vijay
{
    public static void main(String arr[])
    {
      
      System.out.println("Smallest Number 1st Function:");
      fun1();
      System.out.println("Largest Number 2nd Function:");
      fun2();
     
    }
    static void fun1()
    {
      Scanner ob=new Scanner(System.in);
      int a,b;
      System.out.println("Enter a number");
      a=ob.nextInt();

      System.out.println("Enter a number");
      b=ob.nextInt();

      if(a<b)
      {
        System.out.println("smallest="+a);
      }
    else
    {
        System.out.println("smallest="+b);
    }
    }
    static void fun2()
    {
        Scanner ob=new Scanner(System.in);
        int a,b;
        System.out.println("Enter a number");
        a=ob.nextInt();
  
        System.out.println("Enter a number");
        b=ob.nextInt();
  
        if(a>b)
        {
          System.out.println("Largest="+a);
        }
      else
      {
          System.out.println("largest="+b);
      }
    }
   
}