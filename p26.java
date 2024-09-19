import java.util.*;

public class p26{
    public static void eligible(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not eligible");
        }
        else 
        {  
            System.out.println("Person is eligible to vote!!");  
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        try{
            eligible(age);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}