class Teac {
    String name;
    String lastname;
    String fullname;
    int id;

    void setData(String nm, String ln, int i) {
        name = nm;
        lastname = ln;
        id = i;
    }
    void showData()
    {
        System.out.println("name="+name);
        System.out.println("lastname="+lastname);
        System.out.println("id="+id);
    }
    void setname(String nm)
    {
        name = nm;
    }

     void setlastname(String ln)
    {
        lastname = ln;
    }

    String getfullname()
    {
        return name+" "+lastname;
    }
   void setId(int i)
   {
    id=i;
   }
   int getId()
   {
    return id;
   }
}
class Pooja
{
    public static void main(String[] args) {
        Teac t=new Teac();
        t.setname("Sanju");
        t.setlastname("Rwt");
        System.out.println("t.getfullname()");
        t.setId(123);
        t.showData();
    }
}