import java.util.Scanner;

class Students {

    String studentName;
    int studentRollNumber;
    int studentClass;

    Students() {
        studentName = "";
        studentRollNumber = 0;
        studentClass = 0;

    }

    Students(String nm, int roll, int sc) {
        studentName = nm;
        studentRollNumber = roll;
        studentClass = sc;
    }

    void fun(Students t) {
        this.studentName = t.studentName;
        this.studentRollNumber = t.studentRollNumber;
        this.studentClass = t.studentClass;
    }

    void show() {
        System.out.println("Student Name=" + studentName);
        System.out.println("Student Roll Number=" + studentRollNumber);
        System.out.println("Student Class=" + studentClass);
    }
}

class StudentObjectCopy {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        

        System.out.println("Enter name");
        String n = ob.next();

        System.out.println("Enter roll number");
        int r = ob.nextInt();

        System.out.println("Enter class");
        int c = ob.nextInt();

       Students s1 = new Students();
        Students s2 = new Students(n,r,c);
  
          
        s1.fun(s2);
      

        s1.show();
        System.out.println();
        s2.show();
    }
}