import java.util.Scanner;

class ArrayDelate {
    public static void main(String[] args) {
        int size;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter size");
        size = ob.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array elements");
        for (int i = 0; i < size; i++) {
            a[i] = ob.nextInt();
        }
        System.out.println("Enter Array Locotion");
        int loc=ob.nextInt();
        for(int i=loc;i<size-1;i++)
        {
            a[i]=a[i+1];
        }
        size--;
        System.out.println("New array");
        for (int i = 0; i < size; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}