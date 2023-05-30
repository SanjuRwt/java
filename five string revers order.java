import java.util.*;
class Stringrevers
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        String st[]=new String[5];
        int i;
        System.out.println("Enter 5 string");
        for(i=0;i<5;i++)
        {
            st[i]=ob.next();
        } 
        fun(st);
    }

    static void fun(String a[])
    {
        System.out.println("Result");
        int j;
        for(j=4;j>=0;j--)
        {
            System.out.println(a[j]);
        }
    }
}