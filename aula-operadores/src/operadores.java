import java.util.Date;

public class operadores {

    public static void main(String[] args) {
        // aritmeticos,unarios, relacionais, logicos, ternarios

        String nome = "Miauzita";
        int idade = 2;
        double peso = 2.5;
        char sexo = 'F';
        boolean gato = true;
        Date dataNascimento = new Date();

        // Concatenação +

        String nomeCompleto = "Linguagem " + "JAVA";
        System.out.println(nomeCompleto);

        // Unario
        int numero = 5;
        System.out.println(-numero);
        numero++;
        System.out.println(numero);

        // ternário
        int a, b;
        a = 2;
        b = 3;
        String resultado = a == b ? "verdaeiro" : "falso";

        System.out.println(resultado);

        // relacionais == , >= ,<= , !=
        // Logicos && , ||

    }
}
