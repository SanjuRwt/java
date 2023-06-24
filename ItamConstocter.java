class ItamConstocter {
    int itamcode;
    String itamname;
    float purchasprice;
    float sellingprice;
    float gst;

    ItamConstocter() {
        itamcode = 101;
        itamname = "Led";
        purchasprice = 10000;
        sellingprice = 20000;
        gst = 5.2f;
        System.out.println("Default constocuter");
    }

    ItamConstocter(int icode, String nm, float purprice, float seprice, float tax) {
        itamcode = icode;
        itamname = nm;
        purchasprice = purprice;
        sellingprice = seprice;
        gst = tax;
    }

    void showData() {
        System.out.println("Itam code=" + itamcode);
        System.out.println("Itam name=" + itamname);
        System.out.println("Itam purchasprice=" + purchasprice);
        System.out.println("Itam sellprice=" + sellingprice);
        System.out.println("Itam gst=" + gst);
    }
}

class ItamConstocte {
    public static void main(String[] args) {
        ItamConstocter i1 = new ItamConstocter();
        ItamConstocter i2 = new ItamConstocter(102,"i-Pade",70000,80000,5.5f);
        i1.showData();
        System.out.println();
        i2.showData();
    }
}