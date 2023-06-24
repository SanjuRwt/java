import java.util.Scanner;

class addtoMatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        int b[][]=new int[2][2];
        int c[][]=new int[2][2];
        Scanner ob=new Scanner(System.in);
        int i,j;
        System.out.println("Enter 1st Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }

        System.out.println("Enter 2nd Matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                b[i][j]=ob.nextInt();
            }
        }
        System.out.println("sum ofmatrix");
         for(i=0;i<2;i++)
        {
            for(j=0;j<2;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");
            }
        }
    }
}
