import java.util.*;
class Full 
{
    public static void main(String arr[])
    {
        int a[],i,sum=0,e=0,o=0;
        float avg=0;
        a=new int[10];
        Scanner s=new Scanner(System.in);
        for(i=0;i<=9;i++)
        {
            System.out.println("Enter 10 number");
            a[i]=s.nextInt();
            if(a[i]%2==0)
            {
                e++;
            }else
            {
                o++;
            }
            sum+=a[i];
            avg=sum/10;
        }
        System.out.println("Even="+e);
        System.out.println("Even="+o);
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);

    }
}