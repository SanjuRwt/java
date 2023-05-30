import java.util.*;
class Sureshz
{
public static void main (String arr[])
{
    int i=1,n;
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter Any Table..");
    n = ob.nextInt();
    function(n,i);
}
static void function(int a ,int b)
{
    for(b=1;b<=10;b++)
    {
        System.out.println(a*b);
    }
}
}