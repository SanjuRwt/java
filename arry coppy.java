import java.util.*;
class Copy
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);

        int size,i;
        int a1[],a2[];

        System.out.print("Enter size");
        size=ob.nextInt();

        a1=new int[size];
        a2=new int[size];

        System.out.println("enter elements:");
        for(i=0;i<size;i++)
        { 
            a1[i]=ob.nextInt();
        }

        System.out.println("First Arry elements:");
        for(i=0;i<size;i++)
        { 
           System.out.println(a1[i]);
        }

        System.out.println("Second  Arry elements:");
        for(i=0;i<size;i++)
        { 
           a2[i]=a1[i];
           System.out.println(a2[i]);
        }
    }
}