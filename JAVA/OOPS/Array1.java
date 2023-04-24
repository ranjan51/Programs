import java.util.Scanner;

public class Array1 {
    public static void main(String args[])
    {
        Scanner rj = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS");
        int size = rj.nextInt();
        
        int Student[]=new int[size];
        System.out.println("ENTER THE VALUE");
        for(int i=0;i<Student.length;i++)
        {
            Student[i] = rj.nextInt();
        }
        System.out.println("ENTERS THE NUMBER THAT YOU WANT TO FIND");
        int search = rj.nextInt();
        int count =0;
        for(int j=0;j<Student.length;j++)
        {
           if(Student[j] == search)
           {
                
                System.out.println("ELEMENT FOUND AT INDEX" + count);
                break;
           }
           else{
            count = count +1;
           }
        }
    }
}
