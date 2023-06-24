import java.util.Scanner;

class ObjectArray {
    int a, b;
    Scanner ob = new Scanner(System.in);

    void setA() {
        System.out.println("Enter A Number");
         a = ob.nextInt();
        System.out.println("Enter B  number");
         b = ob.nextInt();
    }

    void show() {
        System.out.println(a + "  " + b + "  ");
    }
}

class ObjectArrayValue {
    public static void main(String[] args) {

        ObjectArray e1[] = new ObjectArray[4];
        for (int i = 0; i < e1.length; i++) {
            e1[i] = new ObjectArray();
            e1[i].setA();
        }
        for (int i = 0; i < e1.length; i++) {
            e1[i].show();
        }
    }
}
