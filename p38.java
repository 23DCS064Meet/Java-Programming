import java.util.ArrayList;
import java.util.Scanner;

public class p38 {
    private ArrayList<Object> list;

    public p38() {
        list = new ArrayList<Object>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }

    public void push(Object o) {
        list.add(o);
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public static void main(String[] args) {
        p38 stack = new p38();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("Welcome to MyStack!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Size");
            System.out.println("5. Is Empty");
            System.out.println("0. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter an element to push: ");
                    Object element = scanner.nextLine();
                    stack.push(element);
                    System.out.println("Pushed: " + element);
                    break;

                case 2:
                    try {
                        Object popped = stack.pop();
                        System.out.println("Popped: " + popped);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        Object top = stack.peek();
                        System.out.println("Top element: " + top);
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println("Stack size: " + stack.getSize());
                    break;

                case 5:
                    System.out.println("Is stack empty? " + stack.isEmpty());
                    break;

                case 0:
                    System.out.println("Exiting........");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown option. Please try again.");
            }
        }
    }
}
