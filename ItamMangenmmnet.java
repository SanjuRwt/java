class Itam {
    int itamcode;
    String itamname;
    float purchasprice;
    float sellingprice;
    float gst;

    void setGenralData(int icode, String inm, float purprice, float selprice, float tax) {
        itamcode = icode;
        itamname = inm;
        purchasprice = purprice;
        sellingprice = selprice;
        gst = tax;
    }

    void showItamData() {
        System.out.println("Itam Code=" + itamcode);
        System.out.println("Itam Name=" + itamname);
        System.out.println("Itam Purchasprice=" + purchasprice);
        System.out.println("Itam SelPrice=" + sellingprice);
        System.out.println("Gst = "+gst);
        System.out.println("After Tax Itam Gst=" + (sellingprice*gst)/100);
    }

    void setItamcode(int icode) {
        itamcode = icode;
    }

    int getItamcode() {
        return itamcode;
    }

    void setItamname(String inm) {
        itamname = inm;
    }

    String getItamname() {
        return itamname;
    }

    void setItampuchasprice(float purprice) {
        purchasprice = purprice;
    }

    float getItampurchasprice() {
        return purchasprice;
    }

    void setSellingprice(float selprice) {
        sellingprice = selprice;
    }

    float getSellingprice() {
        return sellingprice;
    }

    void setGst(float tax) {
        gst = tax;
    }

    float getGst() {
        return gst;
    }
    float getSellingpriceAfterpurchas()
    {
       
        return  (sellingprice*gst)/100;
    }
}

class ItamMAnegemnt {
    public static void main(String[] args) {
        Itam i1 = new Itam();
        i1.setItamcode(101);
        i1.setItamname("LED");
        i1.setItampuchasprice(10000f);
        i1.setSellingprice(20000f);
        i1.setGst(32.5f);
        i1.showItamData();
    }
}