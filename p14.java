import java.util.*;
public class p14{
    public static void main(String[] args) {
        date d1= new date();
        d1.get();
        d1.put();
    }
    
}
class date
{
    Scanner sc=new Scanner(System.in);
    int day,month,year;
    date()
    {
        day=1;
        month=1;
        year=1;
    }
    void get()
    {
        System.out.println("Enter the day:");
        day=sc.nextInt();
        System.out.println("Enter the Month:");
        month=sc.nextInt();
        System.out.println("Enter the year:");
        year=sc.nextInt();
    }
    void put()
    {
        System.out.println(day+"/"+month+"/"+year);
    }
}