import java.util.*;
class Vowel
{
    public static void main(String [] arr)
    {
        Scanner ss=new Scanner(System.in);
        System.out.print("Enter Chaerter");
        char a=ss.next(String);
        switch(a)
        {
            case 'A':
            System.out.print("Vowel");
            break;
            case 'E':
            System.out.print("Vowel");
            break;
            case 'I':
            System.out.print("Vowel");
            break;
            case 'O':
            System.out.print("Vowel");
            break;
            case 'U':
            System.out.print("Vowel");
            break;
            default:
            System.out.println("consonet");
            break;
        }
    }
}