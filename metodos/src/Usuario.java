public class Usuario {

    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        System.out.println("TV Ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("TV Ligada? " + smartTV.ligada);
        smartTV.diminuirVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
        smartTV.diminuirVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
        smartTV.aumentarVolume();
        System.out.println("Volume Atual: " + smartTV.volume);
        smartTV.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTV.canal);

    }

}
