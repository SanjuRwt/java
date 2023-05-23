import java.util.*;

class Mom
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int a[][]=new int [2][4];
        int i,j,e=0,o=0;
        for(i=0;i<2;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.println("Enter Elements");
                a[i][j]=s.nextInt();
            }
        }

        for(i=0;i<2;i++)
        {
            for(j=0;j<4;j++)
            {
                if(a[i][j]%2==0)
                {
                  e++;
                }else
                {
                    o++;
                }
            }
        }
        System.out.println("Even="+e);
        System.out.println("Odd="+o);

    }
}