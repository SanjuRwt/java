public class butterflypatter {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 6; j++) {
                // i<=3?j++:j--;
                if (j <= i || j >= 7 - i) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
