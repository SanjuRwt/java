class RecoursonMethod {
    int sum(int b) {
        if (b > 0) {
            return b + sum(b - 1);
        } else {
            return 0;
        }
    }
}

public class Recourson {
    public static void main(String[] args) {
        RecoursonMethod r = new RecoursonMethod();
        int a = r.sum(3);
        System.out.println(a);
    }
}
