import java.util.Scanner;

public class allprimenumberprint {
   public static void main(String arr[])
   {
    Scanner ob=new Scanner(System.in );
    int n1,n2,i,j;
    System.out.println("Enter two numbers");
    n1=ob.nextInt();
    n2=ob.nextInt();

    for(i=n1;i<n2;i++)
    {
        for(j=2;j<i;j++)
        {
            if(i%j==0)
           
                break;
           
        }
        if(i==j)
        
         System.out.print(" \t"+j); 
    }
   } 
}
