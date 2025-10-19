import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        CollectionsManupulations collectionsManupulations = new CollectionsManupulations();

        // ArrayList
        List<String> myArrayList = collectionsManupulations.getMyArrayList();
        System.out.println("==== ArrayList: ");
        System.out.println(myArrayList.get(1)+ "\n");

        // LinkedList
        List<String> myLinkedList = collectionsManupulations.getMyLinkedList();
        System.out.println("==== LinkedList: ");
        System.out.println(myLinkedList.get(2)+ "\n");

        // HashSet
        Set<String> myHashSet = collectionsManupulations.getMyHashSet();
        System.out.println("==== HashSet: ");
        System.out.println(myHashSet.size()+ "\n");
    }
}