import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Product implements Comparable<Product> {
    private String name;
    private double price;
    private double rating;

    public Product(String name, double price, double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public int compareTo(Product other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price=" + price + ", rating=" + rating + "}";
    }
}

public class p39 {
    
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter product rating: ");
            double rating = scanner.nextDouble();
            scanner.nextLine();

            products[i] = new Product(name, price, rating);
        }

        System.out.println("\nBefore sorting:");
        for (Product product : products) {
            System.out.println(product);
        }

        while (true) {
            System.out.println("\nChoose sorting criteria (or enter 0 to exit):");
            System.out.println("1. Sort by Name");
            System.out.println("2. Sort by Price");
            System.out.println("3. Sort by Rating");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("exiting........");
                break;
            }

            switch (choice) {
                case 1:
                    sortArray(products);
                    break;

                case 2:
                    sortArray(products, Comparator.comparingDouble(Product::getPrice));
                    break;

                case 3:
                    sortArray(products, Comparator.comparingDouble(Product::getRating));
                    break;

                default:
                    System.out.println("Invalid choice.");
                    continue;
            }

            System.out.println("\nAfter sorting:");
            for (Product product : products) {
                System.out.println(product);
            }
        }

        scanner.close();
    }

    public static <T> void sortArray(T[] array, Comparator<? super T> comparator) {
        Arrays.sort(array, comparator);
    }
}
