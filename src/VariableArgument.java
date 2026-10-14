public class VariableArgument {
    public static void main(String[] args) {

        System.out.println("Hello World");

        System.out.println("=".repeat(20));
        String[] splitsString = "Hello World again".split(" ");
        printText(splitsString);

        System.out.println("=".repeat(20));
        printText("Hello", "World", "again");

        System.out.println("=".repeat(20));
        String[] sArray = {"Hello", "World", "again"};
        printText(sArray);

    }

    public static void printText(String... textList) {
        for(String s : textList){
            System.out.println(s);
        }
    }
}
