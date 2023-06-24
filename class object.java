class Demo
{
    int a,b;
    void set(int x,int y)
    {
        a=x;
        b=y;
    }
    int show()
    {
        int sum=a+b;
        return sum;
    }
}
class Sanju
{
    public static void main(String[] args) {
        Demo ob=new Demo();
        ob.set(5,9);
        ob.show();
        
    }
}