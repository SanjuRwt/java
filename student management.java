import java.util.*;
class StudentManjement {
    public static void main(String[] args) {
        int choice =0 ;
        ArrayList<Student> allStudents = new ArrayList<Student>();
        do{
            Scanner obj = new Scanner(System.in);
            System.out.println("Press 0 to exit");
            System.out.println("Press 1 to add student");
            System.out.println("Press 2 to remove student ");
            System.out.println("Press 3 to view all students");
            choice = obj.nextInt();
            switch(choice){
                case 1 :
                    //Student studentObj = new Student();
                    System.out.println("Name : ");
                    String name = obj.next();
                    System.out.println("Roll Number : ");
                    int rollNumber = obj.nextInt();
                    allStudents.add(new Student(name,rollNumber));
                    break;
                case 2 :
                    System.out.println("remove student");
                    System.out.println("Roll Number : ");
                    int rollNumberToDelete = obj.nextInt();
                    for(int i = 0; i < allStudents.size();i++){
                        if(rollNumberToDelete == allStudents.get(i).rollNumber){
                            allStudents.remove(i);
                        }
                    }
                    break;
                case 3 :
                    System.out.println("show all students");
                    System.out.println("Roll Number \t Name");
                    for(Student studentObj : allStudents){
                        System.out.println(studentObj.rollNumber+" \t\t "+studentObj.name);
                    }
                    break;
                default : 
                    break;
            }
            System.out.println("------------------------------");
        }while(choice!=0);
    }
}
 class Student{
    public int rollNumber;
    public int age;
    public String name;
    public String motherName;
    public String fatherName;
    public String className;
    public Student(String name,int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
}