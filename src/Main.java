import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        CollectionsManupulations collectionsManupulations = new CollectionsManupulations();

        // List
        List<String> list = collectionsManupulations.getMyList();
        System.out.printf(list.get(1));

        // Set
        Set<String> sets = collectionsManupulations.getMySets();
        System.out.println(sets.size());
    }
}