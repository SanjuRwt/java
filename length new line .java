import java.util.*;
class Count
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);
        int len,i=0;
        String st;
        System.out.print("Enter String:");
        st=s.next();

        len=st.length();
        for(i=0;i<len;i++)
        {
            System.out.println(st.charAt(i));
        }
    }
} 