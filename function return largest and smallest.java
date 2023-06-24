class MyArray
{
    int largestElement(int a[])
    {
        int i,largest=a[0];
        for(i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            largest=a[i];
        }
        return largest;
    }

int smallestElement(int a[])
{
    int i,smallest=a[0];

    for(i=0;i<a.length;i++)
    {
        if(a[i]<smallest)
        smallest=a[i];
    }
    return smallest;
}
class AllArray
{
   public static void main(String[] args) {
    int arr[]={4,5,6,2,4,7,8};

    MyArray ob=new MyArray();
    System.out.println("Largest element"+ob.largestElement(arr));
    System.out.println("smallest element"+ob.smallestElement(arr));
   }
}
}
