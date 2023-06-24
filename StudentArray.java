import java.util.Scanner;

class StudentArray {
    String name;
    int rollNumber;
    int stuClass;
    String stuId;

    StudentArray(String n, int r, int c, String i) {
        name = n;
        rollNumber = r;
        stuClass = c;
        stuId = i;
    }

    void fun(StudentArray t)
    {
        this.name=t.name;
        this.rollNumber=t.rollNumber;
        this.stuClass=t.stuClass;
        this.stuId=t.stuId;
    }

    void show() {
        System.out.println("Student Name=" + name);
        System.out.println("roll Number=" + rollNumber);
        System.out.println("student class=" + stuClass);
        System.out.println("Student id=" + stuId);
    }
}

class StudentArrayuse {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        StudentArray[] stu = new StudentArray[2];
       
        int i;
        for (i = 0; i < stu.length; i++) {
            System.out.println("Enter student name");
            String nm = ob.next();

            System.out.println("Enter student roll number");
            int rn = ob.nextInt();

            System.out.println("Enter student class ");
            int sc = ob.nextInt();

            System.out.println("Enter student Id");
            String id = ob.next();

            stu[i]=new StudentArray(nm, rn, sc, id);          
        }
        
        for(i = 0; i < stu.length; i++)
        {
           stu[i].show();
           System.out.println();
        }
    }
}