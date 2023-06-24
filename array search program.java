import java.util.Scanner;

class search
{
    public static void main(String[] args) {
        int a[]=new int[5];
        int n,count=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter elemnts");
        for(int i=0;i<a.length;i++)
        {
            a[i]=ob.nextInt();
        }

        System.out.println("Enter search number");
        n=ob.nextInt();

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Itam found"+count+" ");
        }
        else{
            System.out.println("not");
        }
    }
}