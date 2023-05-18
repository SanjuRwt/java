import java.util.*;
class Lar
{
    public static void main(String are[])
    {
        Scanner ob=new Scanner(System.in);
        int a,max=0,i=1;

        while(i <= 5) 
        { 
        System.out.print("Enter no. "  ); 
        a = ob.nextInt(); 
        if(i == 1) 
        max = a; 
        if(max < a) 
        max = a; 
        i++; 
        } 
        System.out.print(max);
        }
        
    }
