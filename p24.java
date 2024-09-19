import java.util.*;
public class p24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of x: ");
        int x = sc.nextInt();
        System.out.println("enter the value of y: ");
        int y = sc.nextInt();

        try 
        {
            int z=x/y;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
