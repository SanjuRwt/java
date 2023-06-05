import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int y;
        System.out.println("Enter year");
        y=s.nextInt();

        if((y%100==0&&y%400==0)||(y%100!=0 && y%400==0))
        {
          System.out.println("year is leap year");
        }else 
        {
         System.out.println("year is Not leap year");
        }
    }
}
