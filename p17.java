public class p17 {

    void print1() {
        System.out.println("This is parent class");
    }

    public static void main(String[] args) {
        p17 obj1 = new p17();
        Child obj2 = new Child();
        obj1.print1();
        obj2.print1();
        
    }
}

class Child extends p17{
    void print1() {
        System.out.println("This is child class");
    }
}