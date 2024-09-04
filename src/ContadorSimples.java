package src;


public class ContadorSimples {

    //Usando o for
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteração nº " + i);
        }


        // usando o while
        int contador = 0;

        while (contador <= 10) {
            System.out.println(contador);
            contador++;
        }


        //Uso do do-while
        do{
            System.out.println( "interacao alfa " + contador);
            contador++;
        }while (contador < 5);
    }


}

