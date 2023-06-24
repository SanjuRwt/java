import java.util.Scanner;
class My{
    int itemCode;
    String itemName;
    float purchasePrice;
    float sellingPrice;
    float gst;
void setShowData(int c,String n,float p,float s,float g)  {
    itemCode=c;
    itemName=n;
    purchasePrice=p;
    sellingPrice=s;
//gst=s;
} 
void getShowData(){ 
    System.out.print("Item code : "+itemCode);
    System.out.print("Item Name : "+itemName);
    System.out.print("Item purchase : "+purchasePrice);
    System.out.println("Item selling : "+sellingPrice);
    System.out.print("Item gst : "+getGst());
   System.out.println("Selling price after gst : "+getSellingPriceAfterGst());
  }
    
    float getSellingPriceAfterGst(){
        float afterGst;
        gst=sellingPrice*0.18f;
        afterGst=sellingPrice+gst;
        return afterGst;
    }
    void setIemtCode(int c){
        itemCode=c;
    }
    int getIemtCode(){
        return itemCode;
    }
        void setIemtName(String n){
        itemName=n;
    }
    String getIemtName(){
        return itemName;
    }
    void setPurchasePrice(float p){
        purchasePrice=p;
    }
    float getPurchasePrice(){
        return purchasePrice;
    }
    void setSellingPrice(float s){
        sellingPrice=s;
    }
    float getSellingPrice(){
        return sellingPrice;
    }
    float getGst(){
        float gst;
        gst=sellingPrice*0.18f;
        return gst;
    }
}
class Item {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter a item code :");
          int c = ob.nextInt();
        System.out.print("Enter a item name :");
          String n = ob.next();
        System.out.print("Enter a purchase :");
           float p= ob.nextFloat();
        System.out.print("Enter a selling :");
          float s = ob.nextFloat();
        My ob1 = new My();
        ob1.setIemtCode(c);
        ob1.setIemtName(n);
        ob1.setPurchasePrice(p);
        ob1.setSellingPrice(s);
        ob1.getShowData();
       System.out.println("--------------------------");
       System.out.println("Item code : "+ob1.getIemtCode());
       System.out.println("Item Name : "+ob1.getIemtName());
       System.out.println("Item purchase : "+ob1.getPurchasePrice());
       System.out.println("Item selling : "+ob1.getSellingPrice());
       System.out.println("Item gst : "+ob1.getGst());
   //System.out.println("Selling price after gst : "+getSellingPriceAfterGst());
    }
}