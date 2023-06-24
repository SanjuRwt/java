 class StaticMethodAndNonStaticMethod {
    int a=10;
    static int b=20;
    void show()
    {
        System.out.println(a+" "+b);
    }
    static void des()
    {
        System.out.println(b);
    }
}
class StaticMethodAndNonStatic {
    int a=10;
    static int b=20;
    public static void main(String[] args) {
       StaticMethodAndNonStaticMethod r=new StaticMethodAndNonStaticMethod();
       r.show();
       StaticMethodAndNonStaticMethod.des();
    }
}
