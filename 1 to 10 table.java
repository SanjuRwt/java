import java.util.*;
class Table
{
    public static void main(String[] arr)
    {
        Scanner ss=new Scanner(System.in);
        System.out.print("Enter Table number");
        int n=ss.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}