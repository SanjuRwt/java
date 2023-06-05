import java.util.Scanner;
 class evenoddsum {
    public static void main(String[] args) {
        int n,i,sum=0;
        System.out.println("Enter given numbers");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n%2==0)
        {
            for(i=0;i<=n;i=i+2)
            {
                sum=sum+i;
            }
            System.out.print("Even numbers sum ="+sum);
        }
        else
        {
            for(i=1;i<=n;i=i+2 )
            {
                sum=sum+i;
            }
            System.out.print("odd numbers sum ="+sum);
        }
    }
}
