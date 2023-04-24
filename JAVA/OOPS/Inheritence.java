/*
Inheritance in Java is a concept that acquires the properties from one class 
to other classes for example, the relationship between father and son
 */

class shape{
    int height=5;
    int radius=7;
}
class Triangle extends shape{
    public void area(int l)
    {
        System.out.println("Area is" +(0.5) * (l*height));
    }
}
class Circle extends Triangle{
    public void area()
    {
        System.out.println("Circle area is"+(3.14)* radius*radius);
    }
}


public class Inheritence {
    public static void main(String args[]){
        Triangle s1=new Triangle();
        s1.area(5);
        Circle s2=new Circle();
        s2.area();

    }
}
