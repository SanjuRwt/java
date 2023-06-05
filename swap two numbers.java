import java.util.Scanner;

class swaptwonumbers {
public static void main(String arr[])
{
 Scanner s=new Scanner(System.in);
 int a,b,temp;
 System.out.print("Enter two numbers:");
 a=s.nextInt();
 b=s.nextInt();

 System.out.println("Before swapping:"+a+" "+b);

 temp=a;
 a=b;
 b=temp;

 System.out.println("After swapping:"+a+" "+b);
}
}
