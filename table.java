import java.util.Scanner;
class Digittable {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num;
        System.out.println("Enter number");
        num=s.nextInt();
        for(int i=1;i<=10;i++)
        {
           System.out.println(num+"*"+i+"="+num*i);
        }
    }
}
