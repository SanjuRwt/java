class Assigement
{
    int a,b;

    void setData(int x,int y)
    {
        a=x;
        b=y;
    }
    
    void sum(Assigement t)
    {
      this.a+=t.a;
      this.b+=t.b;
    }
     boolean isEqul(Assigement t){
        if(this.a==t.a&& this.b==t.b){
            return true;

        }else{
            return false;
        }
     }
    void show()
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
class ClassD1D2
{
    public static void main(String[] args) {
        Assigement d1=new Assigement();
        Assigement d2=new Assigement();
        d1.setData(100, 200);
        d2.setData(100, 200);
        boolean res = d1.isEqul(d2);
        System.out.println(res);
        d1.sum(d2);
        
        d1.show();
        d2.show();


    }
}