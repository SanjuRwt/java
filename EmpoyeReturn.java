class EmployeReturn
{
    String name;
    int code;

    EmployeReturn()
    {
        name="";
        code=0;
    }
    EmployeReturn(String n,int c)
    {
        name=n;
        code=c;
    }
    EmployeReturn copy(EmployeReturn t)
    {
        EmployeReturn ob=new EmployeReturn();
        ob.name=t.name;
        ob.code=t.code;
        return ob;
    }
    void show()
    {
        System.out.println("Employe Name="+name);
        System.out.println("Empoye code="+code);
    }
}
class EmployeObjectReturn
{
    public static void main(String[] args) {
        
    
    EmployeReturn e1=new EmployeReturn();
    EmployeReturn e2=new EmployeReturn();
    EmployeReturn e3=new EmployeReturn();

    e2=e1.copy(e3);
    e1.show();
    e2.show();
    e3.show();
    
}
}