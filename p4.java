import java.util.Scanner;
public class p4{
    public static void main(String[] args){
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = scanner.nextInt();
        System.out.println("Enter the amount of the month:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            int amount=scanner.nextInt();
            arr[i]=amount;
        }
        System.out.println("--------------------------------------");
        System.out.println("Your amount is :");
        for(int j=0;j<size;j++)
        {
            System.out.println(arr[j] + " ");
             sum=sum+arr[j];
        }
        System.out.println("--------------------------------------");
        System.out.println("The sum of the amount is :");
        System.out.println(sum);
        System.out.println("--------------------------------------");
    }
}
