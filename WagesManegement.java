import java.util.ArrayList;
import java.util.Scanner;
 class Labourmanegenmnt 
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        ArrayList<WagesManegements>wages=new ArrayList<WagesManegements>();
        
        ArrayList<LabourManegemnet>Labour=new ArrayList<LabourManegemnet>();
        do{
            System.out.println("press 0 to exit");
            System.out.println("press 1 to Add Wages");
            System.out.println("press 2 to Show Artisan list");
            System.out.println("press 3 to Show Labour list");
            System.out.println("press 4 to 1 Month Price List All Wages ");

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
                    int perdayincom=800;
                    System.out.println("Enter Your Name");
                    name=ob.next();
                    
                    wages.add(new WagesManegements(name,perdayincom));
                    break;
                    case 2:
                    System.out.println("Labour Price Start 500 Pay"); 
                    String names;
                    int tankha=500;
                    System.out.println("Enter Your Name");
                    names=ob.next();
                    
                    Labour.add(new LabourManegemnet(names,tankha));
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
                System.out.println("-----------------------ALL Labour LIST-------------------------------");
                System.out.println("Name \t Perdayincom");
                for(LabourManegemnet LabourManegemnetob : Labour){
                    System.out.println(LabourManegemnetob.names+" \t "+LabourManegemnetob.tankha);
                }
                break;
                case 4:
                System.out.println("-----------------------ALL Wages LIST-------------------------------");
                System.out.println("----------price of Artisan-----------");
                System.out.println("Name \t Perdayincom");
                int toatalpricewages;
                for(WagesManegements WagesManegementsob : wages){
                    toatalpricewages =800*28;
                    System.out.println(WagesManegementsob.name+" \t "+WagesManegementsob.perdayincom+"\t"+toatalpricewages);
                }
                System.out.println("----------price of Labour-----------");
                int toatalprice;
                System.out.println("Name \t Rate \t totalprice");
                for(LabourManegemnet LabourManegemnetob:Labour)
                {
                 toatalprice=500*28;
                 System.out.println(LabourManegemnetob.names+" \t "+LabourManegemnetob.tankha+"\t"+toatalprice);
                }
            }
            System.out.println("------------------------------");
        }while(choice!=0);
    }
}
class WagesManegements
{
    public String name;
    public Integer perdayincom;
    public WagesManegements(String name,Integer perdayincom){
    this.name=name;
    this.perdayincom=perdayincom;
    }
}
class LabourManegemnet
{
    public String names;
    public Integer tankha;
    public LabourManegemnet(String names,Integer tankha){
    this.names=names;
    this.tankha=tankha;
    }
}

import java.util.ArrayList;
import java.util.Scanner;
 class Labourmanegenmnt 
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        ArrayList<WagesManegements>wages=new ArrayList<WagesManegements>();
        
        ArrayList<LabourManegemnet>Labour=new ArrayList<LabourManegemnet>();
        do{
            System.out.println("press 0 to exit");
            System.out.println("press 1 to Add Wages");
            System.out.println("press 2 to Show Artisan list");
            System.out.println("press 3 to Show Labour list");
            System.out.println("press 4 to 1 Month Price List All Wages ");

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
                    int perdayincom=800;
                    System.out.println("Enter Your Name");
                    name=ob.next();
                    
                    wages.add(new WagesManegements(name,perdayincom));
                    break;
                    case 2:
                    System.out.println("Labour Price Start 500 Pay"); 
                    String names;
                    int tankha=500;
                    System.out.println("Enter Your Name");
                    names=ob.next();
                    
                    Labour.add(new LabourManegemnet(names,tankha));
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
                System.out.println("-----------------------ALL Labour LIST-------------------------------");
                System.out.println("Name \t Perdayincom");
                for(LabourManegemnet LabourManegemnetob : Labour){
                    System.out.println(LabourManegemnetob.names+" \t "+LabourManegemnetob.tankha);
                }
                break;
                case 4:
                System.out.println("-----------------------ALL Wages LIST-------------------------------");
                System.out.println("----------price of Artisan-----------");
                System.out.println("Name \t Perdayincom");
                int toatalpricewages;
                for(WagesManegements WagesManegementsob : wages){
                    toatalpricewages =800*28;
                    System.out.println(WagesManegementsob.name+" \t "+WagesManegementsob.perdayincom+"\t"+toatalpricewages);
                }
                System.out.println("----------price of Labour-----------");
                int toatalprice;
                System.out.println("Name \t Rate \t totalprice");
                for(LabourManegemnet LabourManegemnetob:Labour)
                {
                 toatalprice=500*28;
                 System.out.println(LabourManegemnetob.names+" \t "+LabourManegemnetob.tankha+"\t"+toatalprice);
                }
            }
            System.out.println("------------------------------");
        }while(choice!=0);
    }
}
class WagesManegements
{
    public String name;
    public Integer perdayincom;
    public WagesManegements(String name,Integer perdayincom){
    this.name=name;
    this.perdayincom=perdayincom;
    }
}
class LabourManegemnet
{
    public String names;
    public Integer tankha;
    public LabourManegemnet(String names,Integer tankha){
    this.names=names;
    this.tankha=tankha;
    }
}

import java.util.ArrayList;
import java.util.Scanner;
 class Labourmanegenmnt 
{
    public static void main(String arr[])
    {
        Scanner ob=new Scanner(System.in);
        int choice;
        ArrayList<WagesManegements>wages=new ArrayList<WagesManegements>();
        
        ArrayList<LabourManegemnet>Labour=new ArrayList<LabourManegemnet>();
        do{
            System.out.println("press 0 to exit");
            System.out.println("press 1 to Add Wages");
            System.out.println("press 2 to Show Artisan list");
            System.out.println("press 3 to Show Labour list");
            System.out.println("press 4 to 1 Month Price List All Wages ");

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
                    int perdayincom=800;
                    System.out.println("Enter Your Name");
                    name=ob.next();
                    
                    wages.add(new WagesManegements(name,perdayincom));
                    break;
                    case 2:
                    System.out.println("Labour Price Start 500 Pay"); 
                    String names;
                    int tankha=500;
                    System.out.println("Enter Your Name");
                    names=ob.next();
                    
                    Labour.add(new LabourManegemnet(names,tankha));
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
                System.out.println("-----------------------ALL Labour LIST-------------------------------");
                System.out.println("Name \t Perdayincom");
                for(LabourManegemnet LabourManegemnetob : Labour){
                    System.out.println(LabourManegemnetob.names+" \t "+LabourManegemnetob.tankha);
                }
                break;
                case 4:
                System.out.println("-----------------------ALL Wages LIST-------------------------------");
                System.out.println("----------price of Artisan-----------");
                System.out.println("Name \t Perdayincom");
                int toatalpricewages;
                for(WagesManegements WagesManegementsob : wages){
                    toatalpricewages =800*28;
                    System.out.println(WagesManegementsob.name+" \t "+WagesManegementsob.perdayincom+"\t"+toatalpricewages);
                }
                System.out.println("----------price of Labour-----------");
                int toatalprice;
                System.out.println("Name \t Rate \t totalprice");
                for(LabourManegemnet LabourManegemnetob:Labour)
                {
                 toatalprice=500*28;
                 System.out.println(LabourManegemnetob.names+" \t "+LabourManegemnetob.tankha+"\t"+toatalprice);
                }
            }
            System.out.println("------------------------------");
        }while(choice!=0);
    }
}
class WagesManegements
{
    public String name;
    public Integer perdayincom;
    public WagesManegements(String name,Integer perdayincom){
    this.name=name;
    this.perdayincom=perdayincom;
    }
}
class LabourManegemnet
{
    public String names;
    public Integer tankha;
    public LabourManegemnet(String names,Integer tankha){
    this.names=names;
    this.tankha=tankha;
    }
}

