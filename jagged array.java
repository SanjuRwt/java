import java.util.*;
class Bgmi
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int a[][] = new int[2][4];
        a[0]=new int[2];
        a[1]=new int[4];
        //a[2]=new int[3];
        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<a[i].length;j++)
        {
          System.out.println("Enter number");
          a[i][j]=ob.nextInt();
        }
        }
        for(int i=0;i<a.length;i++)
        {
        for(int j=0;j<a[i].length;j++)
        {
          System.out.println(a[i][j]);
          
        }
        }
    }
}