import java.util.Scanner;

class BigsetArray {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner ob = new Scanner(System.in);
        int max;
        System.out.println("Enter five Elements");
        for (int i = 0; i < 5; i++) {
            a[i] = ob.nextInt();
        }
        max=a[0];
         for (int i = 1; i < 5; i++){
            if(a[i]>max)
            {
                max=a[i];
            }
         }
         System.out.println("Max="+max);
    }
}