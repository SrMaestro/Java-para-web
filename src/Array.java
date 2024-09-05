package src;

public class Array {
    public static void main(String[] args) {
        //Declarando uma array
        String[] nomes = new String[]{
                "Jose",
                "Maria",
                "Pedro"
        };

       String chamaJose = nomes[0];



    //  Percorrendo uma lista
        for (int i = 0 ; i < nomes.length ; i++){
            System.out.println(nomes[i]);

        }

    }
}
