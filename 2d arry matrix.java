import java.util.Scanner;

class Arrymatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("Enter Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }
         for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
             System.out.print("\n");
        }
    }
}
