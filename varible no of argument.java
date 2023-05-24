class Noof
{
    public static void main(String arr[])
    {
        tmp(3.5f,5.6f,5.6f);

    }static void tmp(float...x)
    {
        float t=0;

        for(float i : x)
        {
           t=t+i;
        }
        System.out.println(t);
    }

}