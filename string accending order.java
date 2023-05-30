class Stringaccending
{
    public static void main(String arr[])
    {
        String nm[]={"sanju","chandu","ajay","suresh","dinu"};
        int i,j;
        String t;
        for(i=0;i<nm.length;i++)
        {
            for(j=i+1;j<nm.length;j++)
            {
                if(nm[i].compareTo(nm[j])>0)
                {
                    t=nm[i];
                    nm[i]=nm[j];
                    nm[j]=t;
                }
            }
        }
        for(i=0;i<nm.length;i++)
        {
            System.out.println(nm[i]);
        }
    }
}