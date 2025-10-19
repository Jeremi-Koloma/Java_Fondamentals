import java.util.ArrayList;
import java.util.List;

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
}
