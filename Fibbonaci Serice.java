import java.util.Scanner;

class Fibbonaci  {
    public static void main(String[] args) {
        int term,a=0,b=1,c;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter term");
        term=ob.nextInt();
        for(int i=1;i<=term;i++)
        {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
