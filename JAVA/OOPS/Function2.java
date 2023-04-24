import java.util.Scanner;

public class Function2 {
    public static int SumofTwo(int n1,int n2)
    {
        int sum=n1+n2;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE 2 NUMBERS");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println(SumofTwo(n1, n2));
    }
    
}
