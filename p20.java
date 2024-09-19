class Shape{
    public void printS()
    {
        System.out.println("This is This shape");
    }
}
class Rectangle extends Shape{
    public void printR()
    {
        System.out.println("This is Rectangle shape");
    }
}
class Circle extends Shape{
    public void printC()
    {
        System.out.println("This is Circle shape");
    }
}
class Square extends Rectangle{
    public void printSq()
    {
        printS();
        printR();
        System.out.println("Square is Reactangle ");
    }
}
public class p20{
    public static void main(String[] args)
    {
        Shape s = new Shape();
        Square A =new Square();
        A.printSq();
        
    }

}
