import java.util.Scanner;
class ArrayEmplye {
    String name;
    int code;
    int salary;
    int max;
    int  setInfo()           
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Name");
        name=ob.next();
        System.out.println("Enter code");
        code=ob.nextInt();
        System.out.println("Enter Salary");
        salary=ob.nextInt();
       int a[]=new int[3];
       
       int max=a[0];
       for(int i=1;i<a.length;i++)
       {
        if(a[i]>max)
        {
            max=a[i];    
        }
       }
       return max;
    }
    void show()
    {
        System.out.println("Name="+name+" "+"code="+code+" "+"salary="+salary);
       
    }
}
class ArrayEmplyee
{
    public static void main(String[] args) {
       ArrayEmplye emp[]=new ArrayEmplye[2];
       int maxsal=0;
       for(int i=0;i<emp.length;i++)
       {
        emp[i]=new ArrayEmplye();
        emp[i].setInfo();
        maxsal=maxsal+emp[i].max;
       } 
        for(int i=0;i<emp.length;i++)
        {
            emp[i].show();
        }
        System.out.println("Max Salary="+maxsal);
    }
}