class Method
{
    int a,b;

    void set(int x,int y)
    {
        a=x;
        b=y;
    }

    int  addNow()
    {
        return (a+b);
    }
    void show()
    {
        System.out.println(addNow());
    }
}
class Nasting
{
    public static void main(String[] args) {
        Method s=new Method();
        s.set(10, 20);
        s.show();
    }
}