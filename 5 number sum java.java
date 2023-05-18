import java.util.*;
class Full 
{
    public static void main(String arr[])
    {
        int a[],i,sum=0;
        a=new int[5];
        Scanner s=new Scanner(System.in);
        for(i=0;i<=4;i++)
        {
            System.out.println("Enter 5 number");
            a[i]=s.nextInt();
            sum=a[i]+sum;
        }
        System.out.println(sum);
    }
}