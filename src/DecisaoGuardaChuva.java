package src;


    public class DecisaoGuardaChuva {
        public static void main(String[] args) {
            boolean estaChovendo = true;
            boolean estaVentando = false;
            boolean estaNublado = true;

            if (estaChovendo && estaVentando) {
                System.out.println("Hoje está chovendo e ventando. Leve um guarda-chuva forte.");
            } else if (estaChovendo && !estaVentando) {
                System.out.println("Hoje está chovendo, porém não está ventando. Leve um guarda-chuva comum.");
            } else if (estaNublado) {
                System.out.println("Hoje está nublado. Leve um guarda-chuva por precaução.");
            } else {
                System.out.println("Hoje está ensolarado. Não precisa levar guarda-chuva.");
            }
        }
    }


