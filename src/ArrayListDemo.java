import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<GorceryItem> gorceryItems = new ArrayList<>();
        gorceryItems.add(new GorceryItem("Butter"));
        gorceryItems.add(new GorceryItem("Bread"));
        gorceryItems.add(new GorceryItem("Potato"));
        gorceryItems.add(new GorceryItem("Oranges", "PRODUCE", 5));

        System.out.println("First Array: " + gorceryItems);
    }
}
