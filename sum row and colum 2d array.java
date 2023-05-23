import java.util.*;
class SumMatrix
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[2][3]; 

        int i,j;
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.println("enter number:");
                a[i][j]=s.nextInt();
            }
        }
        for(i=0;i<2;i++)
        {
            int t=0;
            for(j=0;j<3;j++)
            {
                System.out.print(a[i][j]);
                t+=a[i][j];
            }
            System.out.println(" "+t);
        }
    }
}