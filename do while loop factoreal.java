import java.util.*;
class Xtra
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int n,fact=1,i=1;
        System.out.print("enter number");
        n=s.nextInt();

        do{
            fact=fact*i;
            i++;
        }while(i<=n);
        System.out.print(fact);
    }
    
}