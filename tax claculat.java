/*
 INPUT SAL<=10000 NO TAX
 INPUT SAL>=10000 B/W SAL<=100000 10%TAX
 INPUT SAL>=100000 20%TAX
 */
import java.util.Scanner;
class TAX
{
    public static void main(String[] args) {
        int sal;
        double tax;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your salary:");
        sal=s.nextInt();

        if(sal<=10000)
        {
            System.out.println(sal+" no tax ");
        }
        else if(sal>=10000&&sal<=100000)
        {
          tax=sal*0.10;
          System.out.println(sal+"your tax "+tax);
        }
        else{
            tax=sal*0.10;
            System.out.println(sal+"your tax "+tax);
        }
    }
}