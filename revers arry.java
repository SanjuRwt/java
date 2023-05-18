import java.util.*;
class Rcb
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int arr[];
        int i,e=0,o=0,sum=0,avg=0;

         arr[]=new int arr[10];

        for(i=0;i<=9;i++)
        {
            System.out.println("Enter 10 elemennts:");
            arr[i]=s.nextInt();

            if(arr[i]%2==0)
            {
                e++;
            }else{
                o++;
            }
        }
        System.out.println("even="+e);
        System.out.println("odd="+o);
    }

}