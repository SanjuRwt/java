class Teachar {
    String firstName;
    String lastName;
    String fullName;
    String spacliyaSubject;
    int salary;
    int teacharId;
    String phone;
    String gender;

    void setData(String Fn, String Ln,String fulname, String Sub, int sal, int Id, String ph, String gen) {
        firstName = Fn;
        lastName = Ln;
        fullName=fulname;
        spacliyaSubject = Sub;
        salary = sal;
        teacharId = Id;
        phone = ph;
        gender = gen;
    }

    void showData()
    {
        System.out.println("firstName="+firstName);
        System.out.println("lastName="+lastName);
        System.out.println("Spacial Subject="+spacliyaSubject);
        System.out.println("salary="+salary);
        System.out.println("teacher id="+teacharId);
        System.out.println("phoneNumber="+phone);
        System.out.println("gender="+gender);
    }

    void setFirstName(String Fn) {
        firstName = Fn;
    }


    void setLastName(String Ln)
    {
        lastName = Ln;
    }
    
    String getFullName()
    {
        return firstName +" "+ lastName;
    }

    void setspacliyaSubject(String Sub)
    {
         spacliyaSubject = Sub;
    }
    String getSubject()
    {
        return spacliyaSubject;
    }
    void setSalary(int sal)
    {
        salary = sal; 
    }
    int getSalary()
    {
        return salary;
    }
    void setTeacherId(int Id)
    {
         teacharId = Id;
    }
    int get()
    {
        return teacharId;
    }

    void setPhone(String ph)
    {
         phone = ph;
    }
    String getPhone()
    {
        return phone;
    }

    void setGender(String gen)
    {
        gender=gen;
    }

    String getGender()
    {
        return gender;
    }
}
class TeacharManegemt
{
     public static void main(String[] args) {
        Teachar T1=new Teachar();
        T1.setFirstName("sanju");
        T1.setLastName("Singh");
       System.out.println(T1.getFullName());  
        T1.setspacliyaSubject("Hindi");
        T1.setSalary(10000);
        T1.setTeacherId(1222);
        T1.setPhone("1234567");
        T1.setGender("male");
        T1.showData();    
     }
}