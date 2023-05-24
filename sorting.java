import java.util.Scanner;
class Sorting
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int a[]=new int[10];
        int i,j,t;
        System.out.println("enter elements:");
        for(i=0;i<=9;i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0;i<=9;i++)
        {
            for(j=i+1;j<=9;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        System.out.println("Result:");
        for(i=0;i<=9;i++)
        {
            System.out.println(a[i]);
        }
    }
}