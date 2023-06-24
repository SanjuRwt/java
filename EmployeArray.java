import java.util.Scanner;

class EmployeArray
{
    String name;
    int code;
    int salary;
    
    EmployeArray(String nm,int c,int s)
    {
        name=nm;
        code=c;
        salary=s;
    }
    void show()
    {
        System.out.println("Name="+name);
        System.out.println("Code="+code);
        System.out.println("salary="+salary);
    }
}
class EmployeArraysanju
{
    public static void main(String arr[])
    {

        Scanner ob=new Scanner(System.in);
        EmployeArray[] emp=new EmployeArray[2];
        int i;
        for(i=0;i<emp.length;i++)
        {
            System.out.println("Enter name");
            String nm=ob.next();
            System.out.println("Enter code");
            int c=ob.nextInt();
            System.out.println("Enter salary");
            int s=ob.nextInt();
            
            emp[i]=new EmployeArray(nm,c,s);
            System.out.println();
        }
        for(i=0;i<emp.length;i++)
        {
            emp[i].show();
        }
    }
}