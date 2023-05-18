import java.util.*;
class Mi 
/*{
public static void main(String aee[])
{
    Scanner s=new Scanner(System.in);

    String st;
    System.out.print("Enter string:");
    st=s.nextLine();
    int len=st.length();

    for(int i=len-1;i>=0;i--)
    {
        System.out.print((st.charAt(i)));
    }
}
}*/

{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        int len,i;

        String st;
        System.out.print("Enter string:");
        st=s.next();
        len=st.length();

        for(i=len-1;i>0;i--)
        {
            System.out.println(st.charAt(i));
        }

    }
}