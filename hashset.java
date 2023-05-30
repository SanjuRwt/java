import java.util.*;
class Hashset
{
    public static void main(String arr[])
    {
        HashSet<Integer>student=new HashSet<Integer>();
        {
         student.add(101);
         student.add(102);
         student.add(101);

        if(student.contains(101))
        {
            System.out.println("This Itom olrddy set");
        }

        if(!student.contains(103))
        {
            System.out.println("This Itom not set");
        }
      
        }
    }
}