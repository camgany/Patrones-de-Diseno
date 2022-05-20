package singleton.practice.ejerciciobanco;

import singleton.example.banco.BancaMovil;
import singleton.example.banco.Person;

public class Cliente {
    public static void main(String [] args){
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista libreCambista = new LibreCambista("MARIA");
                libreCambista.cambiarDinero("Bs",70,"$");
            }
        });
        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaDeCambio casaDeCambio = new CasaDeCambio("ANA");
                casaDeCambio.cambiarDinero("$",10,"Bs");
            }
        });
        Thread hilo3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco("Bisa");
                banco.cambiarDinero("E",1,"Bs");
            }
        });
        Thread hilo4 = new Thread(new Runnable() {
            @Override
            public void run() {
                CasaDeCambio casaDeCambio = new CasaDeCambio("CONF");
                casaDeCambio.cambiarDinero("$", 20, "E");
            }
        });
        Thread hilo5 = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista libreCambista = new LibreCambista("JUANA");
                libreCambista.cambiarDinero("$",140,"Bs");
            }
        });
        Thread hilo6 = new Thread(new Runnable() {
            @Override
            public void run() {
                Banco banco = new Banco("UNION");
                banco.cambiarDinero("Bs",90,"E");
            }
        });
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();
        hilo6.start();
    }
}
