import java.util.*;
class Sanju
{
    public static void main(String arg[])
    {
        Scanner sr=new Scanner(System.in);
        char n;
        System.out.print("Enter String:");
        n=sr.nextLine().charAt(0);

        switch(n)
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