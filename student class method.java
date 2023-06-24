class Student
{
    String stuName;
    int stuRollNumber;
    String stuPhoneNumber;
    int stuClassName;

    void setData(String nm,int rollnum,String phone,int stclass)
    {
        stuName=nm;
        stuRollNumber=rollnum;
        stuPhoneNumber=phone;
        stuClassName=stclass;
    }
    void ShowData()
    {
        System.out.println("Name="+stuName);
        System.out.println("RollNumbers="+stuRollNumber);
        System.out.println("PhoneNumbers="+stuPhoneNumber);
        System.out.println("Class Name="+stuClassName);
    }
    void setName(String nm)
    {
        stuName=nm;
    }
    String getName()
    {
        return stuName;
    }
    void setRollnum(int rollnum)
    {
        stuRollNumber=rollnum;
    }
    int getRollnum()
    {
        return stuRollNumber;
    }
    void setPhonenum(String phone)
    {
       stuPhoneNumber=phone;;
    }
    String getPhonenum()
    {
        return stuPhoneNumber;
    }
    void setClass(int stclass)
    {
        stuClassName=stclass;
    }
    int getClass()
    {
        return stuClassName;
    }
} 
class SetAndGet
{
    public static void main(String[] args)
    {
        Student st1=new Student();
        st1.setName("sanju");
        st1.setRollnum(123);
        st1.setPhonenum("12345667890");
        st1.setClass(12);
        st1.ShowData();
    }
}