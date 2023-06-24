import java.util.Scanner;

class ItamArray {
    String iName;
    int iPurchasPrice;
    int iSelPrice;

    ItamArray(String in, int ip, int is) {
        iName = in;
        iPurchasPrice = ip;
        iSelPrice = is;
    }
    void show()
    {
        System.out.println(" Itam Name="+iName);
        System.out.println(" Itam Purchas Price="+iPurchasPrice);
        System.out.println(" Itam Sel Purchas Price="+iSelPrice);
    }
}
class ItamArrays
{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        ItamArray[]i1=new ItamArray[2];
        for(int i=0;i<i1.length;i++)
        {
            System.out.println("Enter itam name");
            String n=ob.next();
            System.out.println("Enter itam price");
            int p=ob.nextInt();
            System.out.println("Enter itam sel Price");
            int sp=ob.nextInt();
            i1[i]=new ItamArray(n, p, i);
        }
        for(int i=0;i<i1.length;i++)
        {
            i1[i].show();
            System.out.println();
        }
    }
}
