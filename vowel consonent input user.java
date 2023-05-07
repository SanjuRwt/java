import java.util.*;
class Cheak
{
    public static void main(String arr[])
    {
        Scanner s=new Scanner(System.in);

        char c;
        System.out.print("Enter Chreacter:");
        c=s.next().charAt(0);

        switch(c)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.print("Vowel");
            break;
            default:
            System.out.print("Consonet");
        }
    }
}