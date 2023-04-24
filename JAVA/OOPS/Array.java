import java.util.Scanner;

public class Array {
    public static void PrintNumbers()
    {
        Scanner sc = new Scanner(System.in);
        int numbers [] = new int[5];
        System.out.println("ENTER THE NUMBERS");
        for(int i =0;i<5;i++)
        {
            numbers[i] = sc.nextInt();
        }
        for(int i =0;i<5;i++)
        {
            System.out.println(numbers[i]);
        }
    }
    public static void main(String args[])
    {
        PrintNumbers();
    }
    
    
}
