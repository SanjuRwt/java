import java.util.Scanner;

class ItamCostPrizeSum
{
    String itamName;
    int code,purchasPrice,selPrice;

    Scanner s=new Scanner(System.in);
    void setData()
    {
        System.out.println("Enter Name");
        itamName=s.next();
        System.out.println("Enter code");
        code=s.nextInt();
        System.out.println("Enter Purchas Price");
        purchasPrice=s.nextInt();
        System.out.println("Enter selling price");
        selPrice=s.nextInt();
    }
    void show()
    {
        System.out.println("Name="+itamName+" "+"Code="+code+" "+"PurchasPrice="+purchasPrice+" "+"Selling Price="+selPrice+" ");
    }
}
class ItamProfitCount
{
    public static void main(String[] args) {
        int totalPurchasPrice=0;
        int totalSellingPrice=0;
        int totalProfit=0;
        ItamCostPrizeSum ob[]=new ItamCostPrizeSum[2];
        for(int i=0;i<ob.length;i++)
        {
            ob[i]=new ItamCostPrizeSum();
            ob[i].setData();

            totalPurchasPrice=totalPurchasPrice+ob[i].purchasPrice;
            totalSellingPrice=totalSellingPrice+ob[i].selPrice;
            totalProfit=totalSellingPrice-totalPurchasPrice;
        }
        for(int i=0;i<ob.length;i++)
        {
            ob[i].show();
        }
        System.out.println("TotalPurchasPrice="+totalPurchasPrice);
        System.out.println("TotalSellingPrice="+totalSellingPrice);
        System.out.println("Total Profit="+totalProfit);
    }
}