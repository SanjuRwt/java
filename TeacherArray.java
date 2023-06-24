import java.util.Scanner;
class TeacherArray {
    String name;
    int salary;
    String id;

    TeacherArray(String n, int s, String i) {
        name = n;
        salary = s;
        id = i;
    }

    void show() {
        System.out.println("Teacher Name=" + name);
        System.out.println("Teacher Salary=" + salary);
        System.out.println("Teacher id=" + id);
    }
}

class TeacherAr {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        TeacherArray[] t1 = new TeacherArray[2];
        int ts = 0;
        String nm = "",ti = "";
        for (int i = 0; i < t1.length; i++) {

            System.out.println("Enter teacher name");
            nm = ob.next();
            System.out.println("Enter teacher salary");
            ts = ob.nextInt();
            System.out.println("Enter teacher id");
            ti = ob.next();

            t1[i] = new TeacherArray(nm, ts, ti);
        }
        for (int i = 0; i < t1.length; i++) {
            t1[i].show();
            System.out.println();
        }
    }
}