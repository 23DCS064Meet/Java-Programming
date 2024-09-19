interface AdvancedArithmetic {
   int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
   public int divisor_sum(int n) {
       int sum = 0;
       for (int i = 1; i <= n; i++) {
           if (n % i == 0) {
               sum += i;
           }
       }
       return sum;
   }
}

public class p22 {
   public static void main(String[] args) {
       MyCalculator myCalculator = new MyCalculator();
       int n = 6; 
       int result = myCalculator.divisor_sum(n);
       System.out.println("The sum of divisors of " + n + " is: " + result);
       }

   }