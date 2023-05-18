import java.util.*;
class Sizee
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a[],i,even=0,odd=0;
        a=new int [10];

        for(i=0;i<=9;i++)
        {
            System.out.println("Enter 10 Elements:");
            a[i]=s.nextInt();
        }
        for(i=0;i<=9;i++)
        {
            if(a[i]%2==0)
            {
                even+=a[i];
            }else{
                odd+=a[i];
            }
        }
        System.out.println("Even="+even);
        System.out.println("odd="+odd);
    }
}