import java.util.Scanner;

class MirororMatrix {
    public static void main(String[] args) {
        int a[][]=new int[2][2];
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Arry Matrix");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j]=ob.nextInt();
            }
        }

        System.out.println("2d Array Matrix");
         for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        }
       

         System.out.println("2d Array Miroror Matrix");
         for(int i=0;i<2;i++)
        {
            for(int j=1;j>=0;j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println("\n");
        } 
    }
}
