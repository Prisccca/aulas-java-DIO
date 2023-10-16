public class CondicaoSwitchCase {

    public static void main(String[] args) {

        String sigla = "XG";

        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            case "EG":
                System.out.println("Extra Grande");
                break;
            default:
                System.out.println("INDEFINIDO");
        }

    }

}
