class Constorcuter
{
    String studentName;
    int studentRollNumber;
    int studentNameClassName;
    String studentPhoneNumber;

Constorcuter()
{
    studentName="";
    studentRollNumber=0;
    studentNameClassName=0;
    studentPhoneNumber="";
    System.out.println("Default constour called");
}
Constorcuter(String nm,int rn,int cn,String pn)
{
    studentName=nm;
    studentRollNumber=rn;
    studentNameClassName=cn;
    studentPhoneNumber=pn;
    System.out.println("paramiterized constour called");

}


void showData()
{
    System.out.println("Student name="+studentName);
    System.out.println("Student roll number="+studentRollNumber);
    System.out.println("Student class name="+studentNameClassName);
    System.out.println("Student phone number="+studentPhoneNumber);
}
}

class Constocuter
{
    public static void main(String[] args) {
        
    Constorcuter s1 = new Constorcuter();
    Constorcuter s2 = new Constorcuter("asha",101,12,"12345678");
    s1.showData();
    System.out.println();
    s2.showData();
    }
}
