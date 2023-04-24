import java.util.Scanner;

public class function {
    public static void PrintMyName(String name)
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        //function f1 = new function();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        PrintMyName(name);
        
    }
    
}
