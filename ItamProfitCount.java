import java.util.Scanner;

class ItamProfitManagemenet {
    String name;
    int purchasPrice;
    int selPrice;
    Scanner ob=new Scanner(System.in);
    void setData()
    {
      System.out.println("Enter name");
      name=ob.next();
      System.out.println("Enter purcha price");
      purchasPrice=ob.nextInt();
      System.out.println("Enter selprice");
      selPrice=ob.nextInt();
    }
    void show()
    {
        System.out.println("Name="+name+" "+"PurchasPrice="+purchasPrice+" "+"SelPrice="+selPrice);
    }
}
class ItamProfit
{
    public static void main(String[] args) {
        ItamProfitManagemenet i1[]=new ItamProfitManagemenet[2];
        int tPurchasPrice=0;
        int tSellingPrice=0;
        int totalProfit=0;
        for(int i=0;i<i1.length;i++)
        {
           i1[i]=new ItamProfitManagemenet();
           i1[i].setData(); 
           tPurchasPrice=tPurchasPrice+i1[i].purchasPrice;
           tSellingPrice=tSellingPrice+i1[i].selPrice;
           totalProfit=tSellingPrice-tPurchasPrice;
        }
        for(int i=0;i<i1.length;i++)
        {
            i1[i].show();
        } 
        System.out.println("Total PurPrice="+tPurchasPrice);
        System.out.println("Total selling price="+tSellingPrice);
        System.out.println("Total Profit="+totalProfit);
    }
}
