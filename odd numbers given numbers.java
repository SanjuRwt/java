import java.util.Scanner;
 class OddNumbers  {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Entre number");
        n=s.nextInt();
        for(int i=0;i<=n;i=i+2)
        {
         System.out.print(i+" ");
        }
    }
}
