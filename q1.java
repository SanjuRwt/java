import java.util.*;
class Consonet
{
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        char ch;
        System.out.print("Enter String:");
        ch=s.nextLine().charAt(0);

        switch(ch)
        {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            System.out.println("Vowel");
            break;
            default:
            System.out.println("Consonet");
            break;
        }
    }
}