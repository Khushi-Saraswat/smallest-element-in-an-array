public class smallest {
    public static void main(String args[])
    {
        int ar[]={10,20,30,1,50};
        int min=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
            }

        }
        System.out.println("Smallest number in an array:"+min );
    }
}
