class Employe {
    int empCode;
    String empName;
    int empBasicSalaray;

    void setData(int c, String nm, int s) {
        empCode = c;
        empName = nm;
        empBasicSalaray = s;
    }

    void showData() {
        System.out.println("Code=" + empCode);
        System.out.println("name=" + empName);
        System.out.println("salary=" + empBasicSalaray);
    }

    void setcode(int c) {
        empCode = c;
    }

    int getcode() {
        return empCode;
    }

    void setname(String nm) {
        empName = nm;
    }

    String getname() {
        return empName;
    }

    void setsalary(int s) {
        empBasicSalaray = s;
    }

    int getSalary() {
        return empBasicSalaray;
    }
}

class EmpManegemnt {
    public static void main(String[] args) {
        Employe e1 = new Employe();
        e1.setcode(10);
        e1.setname("sanju");
        e1.setsalary(50000);
        e1.showData();
    }
}
