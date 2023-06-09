   
        class rect
        {
            int l,b;
            void set(int x,int y)
            {
                l=x;
                b=y;
            }
            void Area()
            {
              int  a=l*b;
                System.out.println("Area="+a);
            }
        }
       class ractangle
       {
        public static void main(String[] args)
        {
            rect obj=new rect();
            obj.set(10,20);
            obj.Area(); 
        }

       }