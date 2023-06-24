class MyDemoNesting
{
    int a,b;
    MyDemoNesting()
    {
        a =0 ;
        b = 0;
    }
    MyDemoNesting(int x)
    {
        a =x;
        b =0;
    }
    MyDemoNesting(int x,int y)
    {
        this(x);
    }
    void show()
    {
        System.out.println("A ="+a);
        System.out.println("B=" +b);
    }
}
public class ConstructerNesting
{
    public static void main(String arr[])
    {
        MyDemoNesting ob = new  MyDemoNesting(10,20);
    
        ob.show();

    }
}