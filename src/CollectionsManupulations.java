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
    public List<String> getMyList() {
        List<String> myList = new ArrayList<>();

        myList.add("A");
        myList.add("B");
        myList.add("A"); // doublons permis
        return myList;
    }


    /**
     * L'INTERFACE SET
     * Pas de doublons
     * Non indexé.
     */
    public Set<String> getMySets() {
        Set<String> mySets = new HashSet<>();

        mySets.add("A");
        mySets.add("B");
        mySets.add("A"); // ignoré
        mySets.add("A"); // ignoré
        mySets.add("C");
        return mySets;
    }
}
