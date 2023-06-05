public class doubletriangle {
    public static void main(String[] args) {
       int i,j;
       for(i=1;i<=5;i++)
       {
        for(j=1;j<=10;j++)
        {
            if(j<=i||j>=11-i)
            {
                System.out.print("*");
            }else
            {
                System.out.print(" ");
            }
        }
        System.out.println( );
       }
    }
}
