 import java.util.*;
 class Calculter 
 {
    public static void main(String [] arr)
    {
        Scanner ss=new Scanner(System.in);
        System.out.print("Enter 1st Number");
        int a=ss.nextInt();
        System.out.print("Enter 2nd Number");
        int b=ss.nextInt();
        
        
        System.out.println("Enter 1 to add");
        System.out.println("Enter 2 to sub");
        System.out.println("Enter 3 to mul");
        System.out.println("Enter 4 to div");
        System.out.print("Enter Your Choice:");
        int select=ss.nextInt();
        
        switch(select)
        {
            case 1:
           int c=a+b;
           System.out.println("Sum="+c);
            break;
            case 2:
            c=a-b;
            System.out.println("Sub="+c);
            break;
            case 3:
            c=a*b;
            System.out.println("Mul="+c);
            break;
            case 4:
            c=a/b;
            System.out.println("Div="+c);
            break;
            default:
            System.out.println("Enter 1 to 4 Choice");
        }
       
    }
    
}
