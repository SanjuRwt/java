import java.util.*;
class V 
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int a[],i;
        a=new int[10];
         for(i=0;i<=9;i++)
         {
            System.out.println("Enter 10 elements:");
            a[i]=s.nextInt();
         }
         System.out.println("you enterd:");
         for(i=0;i<=9;i++)
         {
            System.out.println(a[i]);
         }
    }
}