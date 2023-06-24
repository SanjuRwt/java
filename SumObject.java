class SumObject {
    int a;

    SumObject() {
        a = 0;
    }

    SumObject(int x) {
        a = x;

    }

    void show() {
        System.out.println("Sum=" + a);
    }

    SumObject sum(SumObject t) {
        SumObject ob = new SumObject();
        ob.a = this.a + t.a;
        return ob;
    }
}

class SumConstoctur {
    public static void main(String[] args) {
        SumObject d1 = new SumObject(10);
        SumObject d2 = new SumObject(20);
        SumObject d3 = new SumObject();
        d1.show();
        d2.show();

        d3 = d1.sum(d2);
        d3.show();
    }
}
