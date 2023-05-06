import java.util.*;
class If
{
    public static void main(String [] arr)
    {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter any number");
        int a=ss.nextInt();
        if(a%2==0)
        {
            System.out.println("Else");
        }else{
            System.out.println("Odd");
        }
    }
}