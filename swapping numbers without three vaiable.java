import java.util.Scanner;

class swapwitout{
public static void main(String arr[])
{
 Scanner s=new Scanner(System.in);
 int a,b;
 System.out.print("Enter two numbers:");
 a=s.nextInt();
 b=s.nextInt();

 System.out.println("Before swapping:"+a+" "+b);

 a=a+b;//a=10+20=30
 b=a-b;//b=30-20=10
 a=a-b;//a=30-10=20

 System.out.println("After swapping:"+a+" "+b);
}
}
