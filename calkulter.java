import java.util.*;
class Sanjusingh
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
      
        int num1,num2,result=0;

        System.out.print("Enter 1st Number:");
        num1=s.nextInt();

        System.out.print("Enter 2nd Number:");
        num2=s.nextInt();
        char choice;
        System.out.println("select your opreation :");
        System.out.println("select + to Sum:");
        System.out.println("select - to Sub:");
        System.out.println("select * to Mul:");
        System.out.println("select / to Div:");
        System.out.println("Enter Your choice:");
        choice=s.next().charAt(0);

        switch(choice)
        {
            case '+':
            result=num1+num2;
            System.out.println("Sum="+result);
            break;
            case '-':
            result=num1-num2;
            System.out.println("Sub="+result);
            break;
            case '*':
            result=num1*num2;
            System.out.println("Mul="+result);
            break;
            case '/':
            result=num1/num2;
            System.out.println("Div="+result);
            break;
        }


    }
}