import src.SaboresDeSorvete;

public class Index {
    public static void main(String[] args) {
        pedirSorvete(SaboresDeSorvete.MORANGO);

    }

    public static void pedirSorvete(SaboresDeSorvete sabor) {
        System.out.println("Voce escolheu o sabor : " +  sabor );
    }
}
