import java.util.*;
class Lar
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int a[]=new int[5];
        int i,largest;

        for(i=0;i<=4;i++)
        {
            System.out.println("Enter five numbers:");
            a[i]=s.nextInt();
        }
        largest=a[0];
        for(i=0;i<=4;i++)
        {
            if(a[i]>largest)
            {
                largest=a[i];
            }
        }
        System.out.print("Largest="+largest);
    }
}