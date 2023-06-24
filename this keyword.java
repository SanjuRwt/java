class Sanjurwt
{
    int a,b;

    void set(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    void add()
    {
       int c=a+b;
        System.out.println(c);
    }
}
class hello
{
    public static void main(String[] args) {
        Sanjurwt d1=new Sanjurwt();
        d1.set(10, 20);
        d1.add();
    }
}