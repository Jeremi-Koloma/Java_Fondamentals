import java.util.List;

public class Main {
    public static void main(String[] args) {

        CollectionsManupulations collectionsManupulations = new CollectionsManupulations();
        List<String> list = collectionsManupulations.getMyList();
        System.out.printf(list.get(1));
    }
}