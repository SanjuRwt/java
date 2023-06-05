import java.util.Scanner;
class calculter  {
    public static void main(String[] args) {
        int n1,n2,ch,res;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        n1=s.nextInt();
        n2=s.nextInt();
        
        System.out.println("press 1 to add:");
        System.out.println("press 2 to sub:");
        System.out.println("press 3 to mul:");
        System.out.println("press 4 to div:");
        System.out.println("press 5 to remendor:");
        ch=s.nextInt();
        
        if(ch==1)
        {
            res=n1+n2;
            System.out.println("Sum="+res);
        }else if(ch==2)
        {
            res=n1-n2;
            System.out.println("Sub="+res);
        }else if(ch==3)
        {
            res=n1*n2;
            System.out.println("Mul="+res);
        }else if(ch==4)
        {
            res=n1/n2;
            System.out.println("div="+res);
        }else
        {
            res=n1%n2;
            System.out.println("remonder="+res);
        }
    }
}
