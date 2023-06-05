import java.util.Scanner;

class findafactornumber {
  public static void main(String[] args) {
    int n;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Numbers");
    n=s.nextInt();
    for(int i=1;i<=10;i++)
    {
        if(n%i==0){
        System.out.println(i);
        }
    }
  }  
}
