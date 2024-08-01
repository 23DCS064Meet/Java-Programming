// BillPreparer.java

public class p5 {
    public static void main(String[] args) {
    
        int[] productCodes = {1, 2, 3, 4, 5};
        double[] prices = {1000, 500, 200, 300, 800};

        
        System.out.println("Bill:");
        for (int i = 0; i < productCodes.length; i++) {
            int code = productCodes[i];
            double price = prices[i];
            double tax = calculateTax(code, price);
            double total = price + tax;
            System.out.println("Product Code: " + code + ", Price: " + price + ", Tax: " + tax + ", Total: " + total);
        }
    }

    
    public static double calculateTax(int code, double price) {
        double tax = 0;
        switch (code) {
            case 1: 
                tax = price * 0.08;
                break;
            case 2: 
                tax = price * 0.12;
                break;
            case 3: 
                tax = price * 0.05;
                break;
            case 4: 
                tax = price * 0.075;
                break;
            default: 
                tax = price * 0.03;
                break;
        }
        return tax;
    }
}