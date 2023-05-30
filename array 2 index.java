import java.util.Scanner;
class Returnarray
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("enter a number");
        a=s.nextInt();
        System.out.println("enter 2nd number");
        b=s.nextInt();

    int total[];
       total =  fun(a,b);
        
            for(int j:total)
            {
                System.out.println(j);
            }
        
    }
    static int[] fun(int a,int b)
    {
        int x[] = {a+b, a-b , a*b , a/b , a%b};
      
      return x;

    }
}