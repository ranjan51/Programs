/*
    A constructor in Java is a special method that is used
    to initialize objects. The constructor is called when an object of a class is created.
 */
class student
{
    String name;
    int age;
    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    student(String name,int age)
    {
        this.name=name;
        this.age=age;
        System.out.println("CONSTRUCTOR CALLED");
    }
}

public class Construct{
    public static void main(String args[])
    {
     
        student s1=new student("Ranjan",21);
        s1.printInfo();  
    }
}