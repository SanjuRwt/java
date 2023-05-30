import java.util.*;
class hashmap
{
    public static void main(String arr[])
    {
        HashMap<Integer,String>students=new HashMap<Integer,String>();
        students.put(101,"chandu");
        students.put(102,"sanju");
        students.put(103, "Suresh");

        for(HashMap.Entry<Integer,String>i:students.entrySet())
        {
            int Key=i.getKey();
            String Value=i.getValue();
            System.out.println(Key+" "+Value);
        }
    }
}