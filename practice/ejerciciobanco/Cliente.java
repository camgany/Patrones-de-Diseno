package singleton.practice.ejerciciobanco;

import singleton.example.banco.BancaMovil;
import singleton.example.banco.Person;

public class Cliente {
    public static void main(String [] args){
        Thread hilo1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LibreCambista libreCambista = new LibreCambista("a");
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
        hilo1.start();
        hilo2.start();
        hilo3.start();
    }
}
