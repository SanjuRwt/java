import java.util.*;
class Suresh
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int size,i,count=0;
        System.out.print("enter size:");
        size=ob.nextInt();
        int a[]=new int[size];

        for(i=0;i<size;i++)
        {
            System.out.print("enter elements:");
            a[i]=ob.nextInt();
        }
        
        System.out.print("Enter search number:");
        int n=ob.nextInt();
        for(i=0;i<size;i++)
        {
            if(a[i]==n)
            {
             count++;
            }
        }
        System.out.print(count);
    }
}