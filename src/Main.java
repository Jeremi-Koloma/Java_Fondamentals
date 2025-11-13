import java.util.*;

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
        System.out.println(myQueue.size()+ "\n");

        // HashMap: Rapide, pas d'ordre
        Map<String, Integer> myHashMap = collectionsManupulations.getMyHasMap();
        System.out.println("==== myHashMap:");
        System.out.println(myHashMap+ "\n");

        // LinkedHashMap: Conserve l'ordre d'insertion
        Map<String, String> myLinkedHashMap = collectionsManupulations.getMyLinkedHashMap();
        System.out.println("==== myLinkedHashMap:");
        System.out.println(myLinkedHashMap+ "\n");

        // For Loop
        System.out.println("==== For Loop:");
        System.out.println(collectionsManupulations.runWithForLoop()+ "\n");

        // ForEach
        System.out.println("==== ForEach Loop:");
        System.out.println(collectionsManupulations.runWithForEachLoop()+ "\n");

        // stream with filter
        System.out.println("==== stream filter with letter 'A':");
        System.out.println(collectionsManupulations.runWithStreams());
    }
}