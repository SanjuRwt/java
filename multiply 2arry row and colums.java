import java.util.*;
class Dad
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[2][2];
        int i,j,Multiply=0;
        System.out.println("first Arry=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println("Enter first array elemnts");
                a[i][j]=s.nextInt();
            }
        }

        System.out.println("second Arry=");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.println("Enter  second array elemnts");
                a[i][j]=s.nextInt();
            }
        }


        System.out.println("Multiply Matrix");
        for(i=0;i<2;i++)
        {
            Multiply=0;
            for(j=0;j<2;j++)
            {
             Multiply=a[i][j]*a[i][j];
            }
            System.out.println(Multiply);
        }
       
    }
}