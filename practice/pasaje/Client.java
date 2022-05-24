package factoryMethod.practice.pasaje;

public class Client {
    public static void main (String []args){
        Pasajero mario = new Pasajero();
        mario.setNombre("Mario Torrez Alcazar");
        mario.setCi("124362 SC");
        PasajeInfante p1 = (PasajeInfante) new CreatorPasajeInfante().createProduct();
        p1.setPasajero(mario);
        p1.setNumeroAsiento("14 F");
        p1.showInfo();

        Pasajero cameron = new Pasajero();
        cameron.setNombre("Cameron Dallas Diaz");
        cameron.setCi("945845 LP");
        PasajeInfante p2 = (PasajeInfante) new CreatorPasajeInfante().createProduct();
        p2.setPasajero(cameron);
        p2.setNumeroAsiento("1A");
        p2.showInfo();

        Pasajero dylan = new Pasajero();
        dylan.setNombre("Dylan O'brien Mc Call");
        dylan.setCi("6887645 CBBA");
        PasajeSolidario p3 = (PasajeSolidario) new CreatorPasajeSolidario().createProduct();
        p3.setPasajero(dylan);
        p3.setNumeroAsiento("4B");
        p3.setMotivoDescuento("Tercera Edad");
        p3.setDescuento(20);
        p3.showInfo();

        Pasajero maria = new Pasajero();
        maria.setNombre("Maria Becerra Montecinos");
        maria.setCi("576798 LP");
        PasajeSolidario p4 = (PasajeSolidario) new CreatorPasajeSolidario().createProduct();
        p4.setPasajero(maria);
        p4.setNumeroAsiento("20B");
        p4.setMotivoDescuento("Capacidades diferentes");
        p4.setDescuento(30);
        p4.showInfo();

        Pasajero jaden = new Pasajero();
        jaden.setNombre("Jaden Hossier Mc Call");
        jaden.setCi("3546576 TRJ");
        PasajeStandart p5 = (PasajeStandart) new CreatorPasajeStandart().createProduct();
        p5.setPasajero(jaden);
        p5.setNumeroAsiento("16F");
        p5.showInfo();

        Pasajero nessa = new Pasajero();
        nessa.setNombre("Nessa Barrent Smith");
        nessa.setCi("576893 LP");
        PasajeStandart p6 = (PasajeStandart) new CreatorPasajeStandart().createProduct();
        p6.setPasajero(nessa);
        p6.setNumeroAsiento("7C");
        p6.showInfo();
    }
}
