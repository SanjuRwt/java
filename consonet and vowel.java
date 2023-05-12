import java.util.*;
class Vowel
{
    public static void main(String [] arr)
    {
     char ch;
     Scanner s=new Scanner(System.in);
     System.out.print("Enter string");
     ch=s.next().charAt(0);
     switch(ch)
     {
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
        System.out.print("vowel");
        break;
        default:
        System.out.print("Consonetvjh");
        break;
    
     }
    }
}