public class Dog extends Animal {

    public Dog() {
        super("Mutt", "Big", 50);
    }

    private void bark() {
        System.out.println("Woof...");
    }

    private void run() {
        System.out.println("Dog running...");
    }

    private void walk() {
        System.out.println("Dog walking...");
    }

    private void wagTail() {
        System.out.println("Dog waging tail...");
    }
}
