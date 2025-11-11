import java.util.*;

public class CollectionsManupulations {
    /**
     * LES INTERFACES PRINCIPALES
     * Listes Ordonnées,
     *  Doublons permis
     *  Accès par index
     */
    // ArrayList: Rapide en accès, Mais lent en insertion au milieu
    public List<String> getMyArrayList() {
        List<String> myList = new ArrayList<>();

        myList.add("A");
        myList.add("B");
        myList.add("A"); // doublons permis
        return myList;
    }

    // LinkedList: Rapide en insertion/Suppresion, plus lent en accès indexé.
    public List<String> getMyLinkedList() {
        List<String> myList = new LinkedList<>();

        myList.add("A");
        myList.add("B");
        myList.add("C"); // doublons permis
        myList.add("D");
        myList.add("C"); // doublons permis
        return  myList;
    }


    /**
     * L'INTERFACE SET
     * Pas de doublons
     * Non indexé.
     */
    // HashSet: Pas d'odre garanti, rapide.
    public Set<String> getMyHashSet() {
        Set<String> mySets = new HashSet<>();

        mySets.add("A");
        mySets.add("B");
        mySets.add("A"); // ignoré
        mySets.add("A"); // ignoré
        mySets.add("C");
        return mySets;
    }

    // LinkedHashSet: Conserve l'ordre d'insertion.
    public LinkedHashSet<String> getMyLinkedHashSet() {
        LinkedHashSet<String> myHashSet = new LinkedHashSet<>();

        myHashSet.add("Papa");
        myHashSet.add("Pipi");
        myHashSet.add("Popo");
        myHashSet.add("Pepe");
        myHashSet.add("Pepe"); // ignoré
        return myHashSet;
    }


    /**
     *  Stocke les éléments à traiter
     *  Méthodes importantes : offer(), poll(), peek().
     */

    public Queue<String> getMyQueue() {
        Queue<String> queue = new LinkedList<>();

        queue.offer("A");
        queue.offer("B");
        queue.offer("C");
        System.out.println("=== poll "+ queue.poll()); // A (supprime et retourne le 1er)
        System.out.println("=== peek "+ queue.peek()); // B (retourne le 1er sans supprimer)
        return queue;
    }


    /**
     *  Pas une Collection mais fait partie du framework
     *  Chaque clé est unique
     *  Une valeur peut se répéter
     */

    // HashMap: rapide, pas d’ordre.
    public Map<String, Integer> getMyHasMap() {
        Map<String, Integer> myHasMap = new HashMap<>();

        // Key: Value
        myHasMap.put("age", 15);
        myHasMap.put("year", 2025);
        myHasMap.put("day", 3);
        myHasMap.put("age", 28); // remplace la valeur précédente
        System.out.println(myHasMap.get("age")); // 28
        return myHasMap;
    }
}
