public class p19 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        Square sq = new Square(7);

        
        Rectangle[] shapes = new Rectangle[2];
        shapes[0] = rect;
        shapes[1] = sq;

        
        for (Rectangle shape : shapes) {
            shape.printArea();
            shape.printPerimeter();
            System.out.println();
        }
        


    }
    
}

class Rectangle {
    protected int length;
    protected int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void printArea() {
        int area = length * breadth;
        System.out.println("Area: " + area);
    }

    public void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}