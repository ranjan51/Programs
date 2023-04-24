/*
 Polymorphism in Java is a concept by which we can perform a single action in different 
 ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" 
 means many and "morphs" means forms. So polymorphism means many forms.
 Types:-  1.compile time polymorphism.
          2.run time polymorphism.
 */
class Student{
    public void PrintInfo(String name)
    {
        System.out.println(name);
    }
    public void PrintInfo(int age)
    {
        System.out.println("age is"+age);
    }
    public void PrintInfo(String name,int age)
    {
        System.out.println("NAME IS  "+name+ " AND AGE IS "+age);
    }
}

public class PolyMorphism {
public static void main(String args[])
{
    ArrayList s1=new ArrayList();
    s1.PrintInfo("Ranjan");
    s1.PrintInfo("Ranjan",22);
}
    
}
