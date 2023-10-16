public class ifEncadeados {

    public static void main(String[] args) {

        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota > 3 && nota < 7) {
            System.out.println("Prova de Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
