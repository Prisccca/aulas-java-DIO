public class CondicaoTernaria {
    public static void main(String[] args) {

        int nota = 6;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 3 && nota <= 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
