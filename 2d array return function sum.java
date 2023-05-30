class Twodarray
{
    public static void main(String arr[])
    {
        int a[][]={{1,2,3},{4,5,6}};
        int b[][]={{1,2,3},{4,5,6}};
        int sum[][];
        int i,j;
        sum=fun(a,b);
        {
            for(i=0;i<sum.length;i++)
            {
                for(j=0;j<sum[i].length;j++)
                {
                    System.out.println(" "+sum[i][j]);
                }
            }
        }
    }
    static int[][] fun(int x[][],int y[][])
    {
        int z[][]=new int[2][3];
        for(int i=0;i<z.length;i++)
        {
            for(int j=0;j<z[i].length;j++)
            {
                z[i][j]=x[i][j]+y[i][j];
            }
        }
        return z;
    }

}