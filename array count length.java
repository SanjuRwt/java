import java.util.Scanner;

class arraycountlength {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Array elements");
        for(int i=0;i<a.length;i++)
        {
           a[i]=ob.nextInt();
        }

         System.out.println(" Array 1st elements");
        for(int i=0;i<a.length;i++)
        {
           System.out.println(a[i]+" ");
        }
         System.out.println(" 2nd Array elements");
        for(int i=0;i<a.length;i++)
        {
          System.out.println(a.length);
        }
    }
}
