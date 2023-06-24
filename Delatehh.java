import java.util.Scanner;

class Delate
{
    public static void main(String[] args) {
        int size;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Size");
        size=s.nextInt();
        int a[]=new int[size];
        int i;
        for(i=0;i<size;i++)
        {
            a[i]=s.nextInt();
        }

        System.out.println("Enter Locotion");
        int loc=s.nextInt();
        for(i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        System.out.println("new Array");
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}