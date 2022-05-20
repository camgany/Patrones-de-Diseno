package singleton.practice.ejerciciobanco;

public class LibreCambista {
    private String name;

    public LibreCambista(String name){
        this.name = name;
    }
    public void cambiarDinero(String tipoEntrada,int moneda, String tipoSalida){
        System.out.println(name + " indica que el cambio es:" + EmpresaDeCasaDeCambioDeMoneda.getInstance().cambioDeDinero(tipoEntrada,tipoSalida)*moneda + tipoSalida);
    }
}
