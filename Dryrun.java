import java.util.Scanner;

public class Dryrun {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,c,sum=0,r;
        System.out.println("Enter Number");
        n=s.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            sum=(r*r*r)+sum;
            n=n/10;
        }
        if(c==sum)
        {
            System.out.println("Armstrong");
        }else{
            System.out.println("not");
        }
    }
}
