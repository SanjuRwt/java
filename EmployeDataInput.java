import java.util.Scanner;
class Employee
{
    String Name;
    int salary;

    void setData(String n,int s)
    {
        Name=n;
        salary=s;
    }
    void setName(String n)
    {
        Name=n;
    }
    String getName()
    {
        return Name;
    }

     void setSalary(int s)
    {
        salary=s;
    }
    int getSalary()
    {
        return salary;
    }
    void fun(Employee t)
    {
        this.Name=t.Name;
        this.salary=t.salary;
    }
    void show()
    {
        System.out.println("Name="+Name);
        System.out.println("Salary="+salary);
    }
}
class EmployeDataInput
{
    public static void main(String[] args) {
    
        Scanner ob=new Scanner(System.in);

        System.out.println("Enter Name");
        String name=ob.next();
        System.out.println("Enter Salary");
        int sal=ob.nextInt();
       Employee e1=new Employee();
       Employee e2=new Employee();
       e1.setName(name);
       e1.setSalary(sal);

       e2.fun(e1);
       e1.show();

       System.out.println();
       e2.show();

    }
}