import java.util.Scanner;
class LargestString
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        String st1,st2,largest;

        System.out.println("Enter 1st String:");
        st1=s.next();

        System.out.println("Enter 2nd String:");
        st2=s.next();

        largest= fun(st1,st2);
        System.out.println(largest);
    }

    static String fun(String x,String y)
    {
        if(x.length()==y.length())
        {
            return "String is eqauls";
        }else if(x.length()>y.length())
        {
            return x;
        }else 
        {
            return y;
        }
    }
}