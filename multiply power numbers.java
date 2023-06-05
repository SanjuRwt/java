import java.util.Scanner;
class multiply {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n,p,result=1;
        System.out.println("Enter Number");
        n=s.nextInt();

        System.out.println("Enter Power");
        p=s.nextInt();
        for(int i=1;i<=p;i++)
        {
           result=n*result;
        }
        System.out.println("Result "+result);
    }
}
