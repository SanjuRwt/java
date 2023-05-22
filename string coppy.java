import java.util.*;
class S1
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);

        int size,i;
        String st1[],st2[];

        System.out.println("Enter size");
        size=ob.nextInt();

        st1=new String[size];
        st2=new String[size];
        
        System.out.println("Enter  string");
        for(i=0;i<st1.length;i++)
        {
           st1[i]=ob.next();
        }

        System.out.println("First  string");
        for(i=0;i<st1.length;i++)
        {
           System.out.println(st1[i]);
        }

        System.out.println("second string:");
        for(i=0;i<size;i++)
        {
            st2=st1;
            System.out.println(st2[i]);
        }
    }
}