class TimesSum
{
    int hour,mint,s;
    TimesSum()
    {
        hour=0;
        mint=0;
        s=0;
    }
    TimesSum(int x,int y,int z)
    {
        hour=x;
        mint=y;
        s=z;
    }
   void show()
   {
     System.out.println(hour+":"+mint+":"+s);
   }
   TimesSum add(TimesSum t)
    {
        TimesSum ob=new TimesSum();
       ob.s=(this.s+t.s)%60;
       ob.mint=(this.mint+t.mint)%60+(this.s+t.s)/60;;
       ob.hour=this.hour+t.hour+(this.mint+t.mint)/60;
       return ob;
    }
}
class Main
{
   public static void main(String arr[]) 
   {
    TimesSum ob1=new TimesSum(3,15,30);
    TimesSum ob2=new TimesSum(2,45,80);
    TimesSum ob3=new TimesSum();
    ob3 = ob2.add(ob1);
    ob3.show();
   }
}