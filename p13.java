import java.util.*;
public class p13
{
    public static void main(String[] args) 
    {
        employee e1=new employee();
        employee e2=new employee();
        e1.get();
        e1.put_data();
        e1.raise();
        e1.yearly_salary();
        e2.get();
        e2.put_data();
        e2.raise();
        e2.yearly_salary();
    }
}
class employee
{
    Scanner sc=new Scanner(System.in);
    String F_name,Lname;
    double sal,r,yearly;

    employee()
    {
        
        F_name=" ";
        Lname=" ";
        sal=0;
    }
    void  get()
    {
        System.out.println("Enter First name of employee:");
        F_name=sc.nextLine();
        System.out.println("Enter Last name of employee:");
        Lname=sc.nextLine();
        System.out.println("Enter Salary of employee:");
        sal=sc.nextDouble();
        if(sal<0)
        {
            sal=0;
        }
    }
    void put_data()
    {
        System.out.println("First name of employee:"+F_name);
        System.out.println("Last name of employee:"+Lname);
        System.out.println("Salary of employee:"+sal);
    }
    void yearly_salary()
    {
         yearly=sal*12;
        System.out.println("Yearly salary of employee:"+yearly);
    }
    void raise()
    {
        r=sal+sal*0.1;
        System.out.println("Salary after raise:"+r);
    }
}
