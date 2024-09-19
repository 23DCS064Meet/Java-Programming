public class p32 
{
        public static class hello extends Thread
        {
            public void run()
            {
                System.out.println("hello world");
            }
        }
    
        public static void main(String[] args) {
            hello t1 = new hello();
            t1.start();
        }
    
}
