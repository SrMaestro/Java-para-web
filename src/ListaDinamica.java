package src;

import java.util.ArrayList;

public class ListaDinamica {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("José");
        nomes.add("Maria");
        nomes.add("Pedro");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
