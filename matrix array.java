import java.util.*;
class Matrix
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int a[][]=new int[3][3];
        int i,j;
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("enter elements");
                a[i][j]=s.nextInt();
            }
        }


        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
               if(i==j)
               {
                System.out.print(a[i][j]);
               }
               else
               {
                System.out.print(" ");
               }
               System.out.println(" \t");
            }
        }
    }
}