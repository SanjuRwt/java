import java.util.Scanner;

class ArrayCopy {
    public static void main(String[] args) {
        int a[] = new int[5];
        int b[] = new int[5];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter array elements");
        for (int i = 0; i < a.length; i++) {
            a[i] = ob.nextInt();
        }
        System.out.println("1st array elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }

        System.out.println("2nd array elements");
        for (int i = 0; i < a.length; i++) {
           b[i]=a[i];
            System.out.println(b[i] + " ");
        }
    }
}