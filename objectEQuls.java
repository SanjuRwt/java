class Equls
{
    int a,b;

    void setData(int x,int y)
    {
        a=x;
        b=y;
    }
    void sum(Equls t)
    {
        this.a+=t.a;
        this.b+=t.b;
    }
    boolean isEqul(Equls t)
    {
        if(this.a==t.a&&this.b==t.b)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    void show()
    {
        System.out.println("a="+a);
         System.out.println("b="+b);
    }
}
class ObjectEquls
{
    public static void main(String[] args) {
        Equls e1=new Equls();
        Equls e2=new Equls();

        e1.setData(100, 200);
        e2.setData(100,200);
        boolean res=e1.isEqul(e2);
        System.out.println(res);
        e1.sum(e2);
        e1.show();
        e2.show();
    }
}