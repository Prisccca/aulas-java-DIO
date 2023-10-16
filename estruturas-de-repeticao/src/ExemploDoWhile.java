import java.util.Random;

public class ExemploDoWhile {

    public static void main(String[] args) {

        // do while acontece ao menos uma vez
        System.out.println("Discando...");

        do {
            System.out.println("Tocando");
        } while (tocando());
        System.out.println("ALô!!!!!");
    }

    private static boolean tocando() {

        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }

}
