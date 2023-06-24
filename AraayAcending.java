import java.util.Scanner;

class ArrayAcending {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int a[] = new int[5];
        int i, j, temp;
        System.out.println("Enter Five Elements");
        for (i = 0; i <= 4; i++) {
            a[i] = ob.nextInt();
        }
        for (i = 0; i <= 4; i++) {
            for (j = 1 + i; j <= 4; j++) {
                if(a[i]>a[j]){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        }
        System.out.println("Sort Array");
        for (i = 0; i <= 4; i++) {
            System.out.println(a[i] + " ");
        }
    }
}