public class Task4 {
    public static void swap(int[] a)
    {
        int temp;
        for(int j=0;j<a.length-1;j++)
        {
            for(int i=j+1;i<a.length;i++)
            {
                if(a[j]==0)
                {
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] a = new int[]{0,1,0,3,12};
        swap(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}