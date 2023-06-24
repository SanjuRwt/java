class TeacherConstocuter {
     String teacherName;
     String teacharId;
     int teacherSalary;
     String teacherSubject;

TeacherConstocuter()
{
   teacherName="";
      teacharId="";
      teacherSalary=0;
      teacherSubject="";
      System.out.println("Default constoctur called");
}

TeacherConstocuter(String tn,String ti,int ts,String tsub)
{
     teacherName=tn;
      teacharId=ti;
      teacherSalary=ts;
      teacherSubject=tsub;
}
void showData()
{
     System.out.println("Teacher Name="+teacherName);
     System.out.println("Teacher Id="+teacharId);
     System.out.println("Teacher Salary="+teacherSalary);
     System.out.println("Teacher Subject Name="+teacherSubject);
}

}
class Asha
{
   public static void main(String[] args) {
    TeacherConstocuter t1=new TeacherConstocuter();
    TeacherConstocuter t2=new TeacherConstocuter("Sanju","sr6314006@gmail.com",50000,"hindi");
    t1.showData();
    System.out.println();
    t2.showData();
   } 
}
