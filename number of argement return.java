class VV
{
    public static void main(String afff[])
    {
       int x= tmp(3,4,5);
        int y=tmp(3,4,6);
        System.out.println(x+y);
    }
static int tmp(int...x)
    {
        int t=0;
        for(int i:x)
        {
          t=t+i;
        }
        return t;
    }
}