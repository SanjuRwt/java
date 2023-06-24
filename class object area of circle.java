class Sanju
{
    int r;

    void set(int x)
    {
      r=x;
    }
    void Circle()
    {
        float PI=3.14f,area;
        area=PI*r*r;
        System.out.println("Area of circle"+area);
    }
}
class Circlefiram
{
    int r;
    void area(int x)
    {
        r=x;
    }
    void Areaofcircleof()
    {
        float PI=3.14f,area;
        area=2*PI*r*r;
        System.out.println("Arae of sarkham firam"+area);
    }
}
class Areaofcircle
{
    public static void main(String[] args) {
        Sanju ob=new Sanju();
        ob.set(2);
        ob.Circle();

        Circlefiram ob2=new Circlefiram();
        ob2.area(2);
        ob2.Areaofcircleof();
    }
}