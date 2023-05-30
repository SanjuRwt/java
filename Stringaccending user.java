import java.util.Scanner;
class Stringaccendinguser
{
     public static void main(String arr[]) 
    {
       Scanner s=new Scanner(System.in);
       String st[]=new String[5];
    
       int i,j;
       String t;
       System.out.println("Enter string");
       for(i=0;i<5;i++)
       {
         st[i]=s.next();
       }

       for(i=0;i<5;i++)
       {
         for(j=i+1;j<5;j++)
         {
            if(st[i].compareTo(st[j])>0)
            {
                t=st[i];
                st[i]=st[j];
                st[j]=t;
            }
         }
       }
       System.out.println("Resutlt:");
       for(i=0;i<5;i++)
       {
        System.out.println(st[i]);
       }

    }
}
