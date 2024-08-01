import java.util.Scanner;

public class p12 {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                double pounds = Double.parseDouble(args[0]);
                double rupees = convertPoundsToRupees(pounds);
                System.out.println(pounds + " Pounds is equal to " + rupees + " Rupees");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter amount in Pounds: ");
            double pounds = scanner.nextDouble();
            double rupees = convertPoundsToRupees(pounds);
            System.out.println(pounds + " Pounds is equal to " + rupees + " Rupees");
        }
    }

    private static double convertPoundsToRupees(double pounds) {
        return pounds * 100;
    }
}