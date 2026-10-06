import java.util.Scanner;

public class GetInputFromScanner {
    public static void main(String[] args) {

        int currentYear = 2026;

        try {
            System.out.println(getInputFromScanner(currentYear));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi, what is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi, " + name + "Thanks for taking the course !");

        System.out.println("What year were you born? ");
        String dayOfBirth = scanner.nextLine();
        int age = currentYear - Integer.parseInt(dayOfBirth);

        return "So you are " + age + " years old!";
    }
}
