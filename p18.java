import java.util.*;

class Member{
    String name = new String();
    String addr = new String();
    String  phone_no = new String();
    int age;
    Double salary;

    Scanner sc = new Scanner(System.in);
    

    void setdata(){
        System.out.print("Name     : ");
        name = sc.nextLine();
        System.out.print("Age      : ");
        age = sc.nextInt();
        System.out.print("Phone No : ");
        sc.nextLine();    
        phone_no = sc.nextLine();
        if(phone_no.length()!=10)
        {
            System.out.println("Invalid Phone Number");
            setdata();
        }
        System.out.print("Salary   : ");
        salary = sc.nextDouble();
        System.out.print("Address  : ");
        sc.nextLine(); 
        addr = sc.nextLine();
        
    }
    void getdata()
    {System.out.println();
    System.out.println();
    System.out.println("Name     : " + name);
    
    System.out.println("Age      : " + age);
  
    System.out.println("Phone No : " + phone_no);
    System.out.println("Address  : " + addr);
    System.out.println("Salary   : " + salary);
    

    }
}

public class p18{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee number :");
        int n = sc.nextInt();
        int i;
        Member m1 = new Member();
        for(i=1;i<=n;i++)
        {
            m1.setdata();
            m1.getdata();
            System.out.println("\n");
        }
        

    }

}