import java.util.Scanner;

class countdigit {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,count=0;
        System.out.println("Enter any numbers:");
        n=s.nextInt();
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Digit no "+count);
    }
}
