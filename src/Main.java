import java.util.LinkedHashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        CollectionsManupulations collectionsManupulations = new CollectionsManupulations();

        // ArrayList: Accès par index
        List<String> myArrayList = collectionsManupulations.getMyArrayList();
        System.out.println("==== ArrayList: ");
        System.out.println(myArrayList.get(1)+ "\n");

        // LinkedList: Accès par index
        List<String> myLinkedList = collectionsManupulations.getMyLinkedList();
        System.out.println("==== LinkedList: ");
        System.out.println(myLinkedList.get(2)+ "\n");

        // HashSet: Pas d'ordre garanti
        Set<String> myHashSet = collectionsManupulations.getMyHashSet();
        System.out.println("==== HashSet: ");
        System.out.println(myHashSet.size()+ "\n");

        // LinkedHashSet: Conserve l'ordre d'insertion
        LinkedHashSet<String> myLinkedHashSet = collectionsManupulations.getMyLinkedHashSet();
        System.out.println("==== LinkedHashSet: ");
        System.out.println(myLinkedHashSet.size()+ "\n");

        // Queue:
        Queue<String> myQueue = collectionsManupulations.getMyQueue();
        System.out.println("==== Queue:");
        System.out.println(myQueue.size());
    }
}