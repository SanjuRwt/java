class Test {
    int sub1;

    void set(int sub1) {
        this.sub1 = sub1;
    }

    void showData() {
        System.out.println(sub1);
    }
}

class MyDemo {
    public static void main(String[] args) {
        Test s1 = new Test();
        Test s2 = new Test();
        s1.set(10);
        s2.set(20);
        s1.showData();
        s2.showData();
    }
}                                                                                                                                                                                                                                                                                                                                                                                                                                                