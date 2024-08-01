import java.util.Scanner;

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imaginary + c.imaginary);
    }

    public Complex subtract(Complex c) {
        return new Complex(this.real - c.real, this.imaginary - c.imaginary);
    }

    public Complex multiply(Complex c) {
        return new Complex(this.real * c.real - this.imaginary * c.imaginary, 
                           this.real * c.imaginary + this.imaginary * c.real);
    }

    public void print() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class p16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real part of first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter real part of second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);

        System.out.println("First complex number:");
        c1.print();
        System.out.println("Second complex number:");
        c2.print();

        Complex sum = c1.add(c2);
        Complex difference = c1.subtract(c2);
        Complex product = c1.multiply(c2);

        System.out.println("Sum:");
        sum.print();
        System.out.println("Difference:");
        difference.print();
        System.out.println("Product:");
        product.print();
    }
}