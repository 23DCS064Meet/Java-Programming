import java.util.Scanner;

class p15 {
    private double length;
    private double breadth;

    public p15(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        p15 rectangle = new p15(length, breadth);

        double area = rectangle.returnArea();
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}