import java.util.ArrayList;
import java.util.Scanner;
 class WagesManegement 
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        ArrayList<WagesManegements>wages=new ArrayList<WagesManegements>();
        do{
            System.out.println("press 0 to exit");
            System.out.println("press 1 to Add Wages");
            System.out.println("press 2 to Show ALL Wages List");
            System.out.println("press 3 to 1 Month Price List All Wages ");

            System.out.println("Enter your choice");
            choice=ob.nextInt();

            switch(choice)
            {
                case 1:
                System.out.println("Add wages");
                int ability;
                System.out.println("------------------------------");
                System.out.println("SELECT YOUR ABILITY");
                System.out.println(" press 1 to Artisan");
                System.out.println(" press 2 to Labour");
                System.out.println("select your abelity");
                ability=ob.nextInt();
                switch(ability)
                {
                    case 1:
                    System.out.println(" Artisan Price Start 800 Pay");
                    String name;
                    int perdayincom;
                    System.out.println("Enter Your Name");
                    name=ob.next();
                    System.out.println("Enter Your PerDayIncom");
                    perdayincom=ob.nextInt();
                    wages.add(new WagesManegements(name,perdayincom));
                    break;
                    case 2:
                    System.out.println("Labour Price Start 500 Pay"); 
                    String labourname;
                    int Perdayincom;
                    System.out.println("Enter Your Name");
                    labourname=ob.next();
                    System.out.println("Enter Your PerDayIncom");
                    Perdayincom=ob.nextInt();
                    wages.add(new WagesManegements(labourname,Perdayincom));
                    break;
                }
                break;
                case 2:
                System.out.println("-----------------------ALL ARTISAN LIST-------------------------------");
                System.out.println("Name \t Perdayincom");
                for(WagesManegements WagesManegementsob : wages){
                    System.out.println(WagesManegementsob.name+" \t "+WagesManegementsob.perdayincom);
                }
                break;
                case 3:
                System.out.println("----------price-----------");
                int toatalprice;
                System.out.println("Name \t Rate \t totalprice");
                for(WagesManegements WagesManegementsob:wages)
                {
                 toatalprice=500*28;
                 System.out.println(WagesManegementsob.name+" \t "+WagesManegementsob.perdayincom+"\t"+toatalprice);
                }
            }
            System.out.println("------------------------------");
        }while(choice!=0);
    }
}
class WagesManegements
{
    public String name;
    public int perdayincom;
    WagesManegements(String name,int perdayincom){
    this.name=name;
    this.perdayincom=perdayincom;
    }
}

