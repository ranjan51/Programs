public class Array3 {
    public static void Fibonacci()
    {
        int n=5;
        int sum=0;
        int a = 0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(sum);
            a=b;
            b=sum;
            sum=a+b;
        }
    }
    public static void main(String args[])
    {
       Fibonacci();
    }
    
}
