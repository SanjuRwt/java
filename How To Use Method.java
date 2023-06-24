 import java.util.Scanner;
 class UseMethod {
    int a,b;
    int sum,sub;
    Scanner r=new Scanner (System.in);
    void input()
    {
        System.out.println("Enter two number");
        a=r.nextInt();
        b=r.nextInt();
    }
    void process()
    {
     sum=a+b;
     sub=a-b;
    }
    void output()
    {
        System.out.println("sum="+sum);
        System.out.println("sub="+sub);
    }
class HowtoUseMethod
{
    public static void main(String[] args) {
      UseMethod ob=new UseMethod();
      ob.input();
      ob.process();  
      ob.output();
    }
}
}

