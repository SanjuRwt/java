import java.util.Scanner;

class ItamSel {
    String itamName;
    int itamCode;
    float itamPurchesSalary;
    float itamSellingPrice;

    ItamSel() {
        itamName = "";
        itamCode = 0;
        itamPurchesSalary = 0;
        itamSellingPrice = 0;
    }

     ItamSel(String in, int ic, int ps, int sp) {
        itamName = in;
        itamCode = ic;
        itamPurchesSalary = ps;
        itamSellingPrice = sp;
    }

    void fun(ItamSel t) {
        this.itamName = t.itamName;
        this.itamCode = t.itamCode;
        this.itamPurchesSalary = t.itamPurchesSalary;
        this.itamSellingPrice = t.itamSellingPrice;
    }

    void show() {
        System.out.println("Itam Name=" + itamName);
        System.out.println("Itam Code=" + itamCode);
        System.out.println("Itam PurchesSalary=" + itamPurchesSalary);
        System.out.println("Itam selling price=" + itamSellingPrice);
    }
}

class ItamManegemnet {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter itam name");
        String in = ob.next();

        System.out.println("Enter itam Code");
        int ic = ob.nextInt();

        System.out.println("Enter itam purchas price");
        int ps = ob.nextInt();

        System.out.println("Enter itam selling price");
        int sp = ob.nextInt();

        ItamSel i1 = new ItamSel();
        ItamSel i2 = new ItamSel(in,ic,ps,sp);

        i1.fun(i2);
        i1.show();
        System.out.println();
        i2.show();

    }
}