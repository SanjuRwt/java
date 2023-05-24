import java.util.Scanner;
class Seconddymenshenal
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        int m[][]=new int[2][3];
        int i,j;
        System.out.println("Enter elemenrs 1st Array:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
              a[i][j]=s.nextInt();
            }
        }

        System.out.println("Enter elemenrs 2nd Array:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
              b[i][j]=s.nextInt();
            }
        }

        System.out.println("Result:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
             m[i][j]=a[i][j]*b[i][j];
             System.out.println(m[i][j]);
            }
        }
    }
}