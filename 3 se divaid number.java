import java.util.*;
class Sanjus
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int num,i=1,count=0;
        for(i=1;i<=10;i++)
        {
            System.out.println("Eneter 10 Number:");
            num=s.nextInt();

           if(num%3==0)
           {
            count++;
           }
        }
        System.out.println(count);
    }
}