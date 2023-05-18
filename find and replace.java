import java.util.*;
class Find
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);

        int size,i;
        int a[];
        int replace,search;
        System.out.print("Enter size:");
        size=ob.nextInt();

        a=new int[size];

        System.out.print("enter elements:");

        for(i=0;i<a.length;i++)
        {
          a[i]=ob.nextInt();  
        }

        System.out.print("enter search number:");
       search=ob.nextInt();

       System.out.print("enter replace number:");
       replace=ob.nextInt();

       System.out.println("After Replace - :");

       for(i=0;i<a.length;i++)
       {
        if(a[i]==search)
        {
            a[i]=replace;
        }
        System.out.println(a[i]);
       } 
    }
}