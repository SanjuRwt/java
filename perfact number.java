import java.util.Scanner;
class perfactnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("Enter number");
        n=s.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(n==sum)
        {
            System.out.println("Perfact number");
        }
        else{
            System.out.println("not perfact number");
        }
    }
}
