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
}
