package exercice;

import java.util.*;

public class Exercice {
    public static List<String> solution(String str, List<Character> ordre) {
        List<String> result = new List<String>();
        String[] mots = str.split(" ");

        // Utilisation d'un comparateur personnalisé pour trier les mots selon l'ordre fixé
        Arrays.sort(mots, new ComparateurOrdreFixe(ordreFixe));

        // Affichage des mots classés
        for (String mot : mots) {
            result.add(mot);
        }
    }
}

class ComparateurOrdreFixe implements Comparator<String> {
    private Map<String, Integer> indexMap = new HashMap<>();

    public ComparateurOrdreFixe(List<String> ordreFixe) {
        for (int i = 0; i < ordreFixe.size(); i++) {
            indexMap.put(ordreFixe.get(i), i);
        }
    }

    @Override
    public int compare(String mot1, String mot2) {
        Integer index1 = indexMap.getOrDefault(mot1, Integer.MAX_VALUE);
        Integer index2 = indexMap.getOrDefault(mot2, Integer.MAX_VALUE);
        return index1.compareTo(index2);
    }
}