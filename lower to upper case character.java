import java.util.Scanner;

class lowertouppercasecharacter {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch,ch2;
        System.out.print("Enter Any Character:");
        ch=s.next().charAt(0);

        if(ch>='A' && ch<='Z')
        {
            ch2=Character.toLowerCase(ch);
            System.out.print(ch2);
        }
        else{
            ch2=Character.toUpperCase(ch);
            System.out.print(ch2);
        }
    }
}
