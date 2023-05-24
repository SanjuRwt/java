class Dinesh
{
    public static void main(String arr[])
    {
        int z=tmp("suresh");
        System.out.println(" "+z);

        int y=cmp("dinesh");
        System.out.println(" "+y);

        compure(z,y);
    }static int tmp(String st1)
    {
        return st1.length();
    }
    static int cmp(String st2)
    {
        return st2.length();
    }
    static void compure(int x,int y)
    {
        if(x==y)
        {
            System.out.println("string is equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}