class Functionoverloding
{
    public static void main(String[] args) {
        Area(2,4);
        Area(3.14f,5);
        Area(0.5f,2,4);
    }
    static void Area(int x,int y)
    {
        int area=x*y;
        System.out.println("Arae of ractangle="+area);
    }
    static void Area(float x,int y)
    {
     double r=x*y*y;
     System.out.println("Area of circle="+r);
    }
    static void Area(float x,int y,int z)
    {
        double g=x*y*z;
        System.out.println(g);
    }
}