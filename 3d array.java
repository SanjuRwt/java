import java.util.Scanner;
class Threearray
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,l;

        int a[][][]=new int [2][2][2];
        int b[][][]=new int [2][2][2];
        int sum[][][]=new int [2][2][2];

        System.out.println("Enter 1st Array Elements");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                for(l=0;l<2;l++)
                {
                    a[i][j][l]=s.nextInt();
                }
            }
        }


        System.out.println("Enter 2nd Array Elements");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                for(l=0;l<2;l++)
                {
                    b[i][j][l]=s.nextInt();
                }
            }
        }

        System.out.println("Result:");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                for(l=0;l<2;l++)
                {
                    sum[i][j][l]=a[i][j][l]+b[i][j][l];
                    System.out.print(" "+sum[i][j][l]);
                }
                
            }
            System.out.println();
    
        }

        // for(i=0;i<2;i++){
        //     for(j=0;j<2;j++)
        //     {
        //         for(l=0;l<2;l++)
        //         { 
                    
        //         }
        //     }
            
        // }
    }
}    