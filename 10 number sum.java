import java.util.*;
class Sanjur
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int num,i=1,sum=0;
        for(i=1;i<=10;i++)
        {
            System.out.println("Eneter 10 Number:");
            num=s.nextInt();

            sum=num+sum;
        }
        System.out.println(sum);
    }
}