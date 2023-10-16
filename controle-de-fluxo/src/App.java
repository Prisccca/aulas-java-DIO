public class App {
    public static void main(String[] args) throws Exception {

        // Condicionais
        double saldo = 1000;
        double valorSaque = 1500;

        if (valorSaque < saldo) {
            saldo = saldo - valorSaque;
            System.out.println(saldo);
        }
        // else {
        // System.out.println("Saldo Insuficiente");
        // }

    }
}
