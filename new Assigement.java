class Demo1
{
    int l,b;
    void set(int x,int y)
    {
        l=x;
        b=y;
    }
    void sum1()
    {
       int  Area=l*b;
        System.out.println(Area);
    }
}
class Demo2
{
    int r;

void set2(int x)
{
    r=x;
}
void sum2()
{
    double PI=3.14;
    double Area;
    Area=PI*r*r;
    System.out.println("Area of circle"+Area);
}
}
class Demo3
{
    int n;

    void set3(int x)
    {
        n=x;
    }
    void sum3()
    {
        if(n%2==0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
class Demo4
{
    int num;
    void set4(int x)
    {
        num=x;
    }
    void sum4()
    {
        if(num>0)
        {
            System.out.println("positive");
        }else{
            System.out.println("negitive");
        }
    }
}
class Demo5
{
    int side;
    void set5(int x)
    {
        side=x;
    }
    void sum5()
    {
        area=side*side;
        System.out.println("Area Of Sqaure"+area);
    }
}

class Function{
public static void main(String arr[])
{
    Demo1 ob1=new Demo1();
    ob1.set(10,20);
    ob1.sum1();

    Demo2 ob2=new Demo2();
    ob2.set2(2);
    ob2.sum2();

    Demo3 ob3=new Demo3();
    ob3.set3(15);
    ob3.sum3();

    Demo4 ob4=new Demo4();
    ob4.set4(-7);
    ob4.sum4();

    Demo5 ob5=new Demo5();
    ob5.set5(5);
    ob5.set5();
}
}