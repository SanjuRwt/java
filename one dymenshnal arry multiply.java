import java.util.Scanner;
class One
{
    public static void main(String app[])
    {
        Scanner s=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int m[]=new int[5];

        int i;
        System.out.println("Enter Elemnt 1st Array:");
        for(i=0;i<=4;i++)
        {
            a[i]=s.nextInt();
        }


        System.out.println("Enter Elemnt 2nd Array:");
        for(i=0;i<=4;i++)
        {
            b[i]=s.nextInt();
        }
        System.out.println("Result:");
        for(i=0;i<=4;i++)
        {
            m[i]=a[i]*b[i];
            System.out.println(m[i]);
        }


    }
}