import java.util.*;
class Table
{
    public static void main(String[] arr)
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println( "Enter Elements:");
        for(int i=0;i<=4;i++)
        {
            a[i]=s.nextInt();
        }

        int search,replae,c=0;
        System.out.println("enter search  number");
        search=s.nextInt();

        System.out.println("enter replace  number");
        replae=s.nextInt();
        for(int i=0;i<=4;i++)
        {
        if(a[i]==search)
        {
          a[i]=replae;
        }
        System.out.println(a[i]);
        }
    }
}