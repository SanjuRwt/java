import java.util.*;
class Mi 
{
public static void main(String aee[])
{
    Scanner s=new Scanner(System.in);

    String st;
    System.out.print("Enter string:");
    st=s.nextLine();
    int len=st.length();

    for(int i=0;i<len;i++)
    {
        System.out.println((st.charAt(i)));
    }
}
}