class MyAjmer
{
    int a,b;

    MyAjmer()
    {
        a=0;
        b=0;
    }
    MyAjmer(int x,int y)
    {
        a=x;
        b=y;
    }
    void fun( MyAjmer t)
    {
        this.a=t.a;
        this.b=t.b;
    }
    void show()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
class Banglore
{
    public static void main(String[] args) {
        MyAjmer d1=new MyAjmer(0, 0);
        MyAjmer d2=new MyAjmer(10, 20);

        d1.fun(d2);

        d1.show();
        d2.show();
    }
}