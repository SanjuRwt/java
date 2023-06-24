import java.util.Scanner;

class Teachers {
    String teacherName;
    int teacherCode;
    String teacherId;
    String teacherPhone;
    String spacilySubject;

    Teachers() {
        teacherName = "";
        teacherCode = 0;
        teacherId = "";
        teacherPhone = "";
        spacilySubject = "";
    }

    Teachers(String tnm, int tcode, String tid, String tph, String ss) {
        teacherName = tnm;
        teacherCode = tcode;
        teacherId = tid;
        teacherPhone = tph;
        spacilySubject = ss;
    }

    void fun(Teachers t) {
        this.teacherName = t.teacherName;
        this.teacherCode = t.teacherCode;
        this.teacherId = t.teacherId;
        this.teacherPhone = t.teacherPhone;
        this.spacilySubject = t.spacilySubject;
    }

    void show() {
        System.out.println("Teacher Name=" + teacherName);
        System.out.println("Teacher Code=" + teacherCode);
        System.out.println("Teacher Id=" + teacherId);
        System.out.println("Teacher Phone=" + teacherPhone);
        System.out.println("Teacher Subject=" + spacilySubject);
    }

}

public class TeacherObjectCall {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        String tnm;
        int tcode;
        String tid;
        String tph;
        String ss;
        System.out.println("Enter Name");
        tnm = ob.next();

        System.out.println("Enter code");
        tcode = ob.nextInt();

        System.out.println("Enter Id");
        tid = ob.next();

        System.out.println("Enter Phone");
        tph = ob.next();

        System.out.println("Enter Subject");
        ss = ob.next();

        Teachers t1=new Teachers();
        Teachers t2=new Teachers(tnm,tcode,tid,tph,ss);

        t1.fun(t2);
        t1.show();
        System.out.println();
        t2.show();
    }
}