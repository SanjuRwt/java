import java.util.*;
class Largest
{
    public static void main(String [] arr)
    {
        Scanner ss=new Scanner(System.in);
        System.out.print("Enter 1st number");
        int a=ss.nextInt();
        System.out.print("Enter 2nd number");
        int b=ss.nextInt();
        if(a>b)
        {
            System.out.print(a);
        }else{
            System.out.print(b);
        }
    }
}