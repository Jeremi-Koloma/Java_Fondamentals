import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsManupulations {
    /**
     * LES INTERFACES PRINCIPALES
     * Listes Ordonnées,
     *  Doublons permis
     *  Accès à l'index
     */

    List<String> myList = new ArrayList<>();

    public List<String> getMyList() {
        List<String> list = myList;
        list.add("A");
        list.add("B");
        list.add("A"); // doublons permis
        return list;
    }


    /**
     * L'INTERFACE SET
     * Pas de doublons
     * Non indexé.
     */
    Set<String> mySets = new HashSet<>();

    public Set<String> getMySets() {
        Set<String> sets = new HashSet<>();
        sets.add("A");
        sets.add("B");
        sets.add("A");
        sets.add("A");
        sets.add("C");
        return sets;
    }
}
