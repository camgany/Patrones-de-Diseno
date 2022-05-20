package singleton.practice.ejerciciobanco;


public class EmpresaDeCasaDeCambioDeMoneda {
    private static EmpresaDeCasaDeCambioDeMoneda empresaDeCasaDeCambioDeMoneda;
    private int monto;
    private String moneda;
//preguntan el tipo de cambio
    private EmpresaDeCasaDeCambioDeMoneda(){
        System.out.println("Iniciar Cambios...........");
    }
    private synchronized static void  multiThreadControl(){
        if (empresaDeCasaDeCambioDeMoneda== null)
            empresaDeCasaDeCambioDeMoneda= new EmpresaDeCasaDeCambioDeMoneda();

    }
    public static EmpresaDeCasaDeCambioDeMoneda getInstance(){
        if (empresaDeCasaDeCambioDeMoneda == null)
            multiThreadControl();
        return empresaDeCasaDeCambioDeMoneda;
    }

    public synchronized double cambioDeDinero(String tipoEntrada, String tipoSalida) {
        if (tipoEntrada == "Bs") {
            if (tipoSalida == "$") {
                return 0.143;
            } else if (tipoSalida == "E") {
                return 0.111;
            }
        } else if (tipoEntrada == "$") {
            if (tipoSalida == "Bs") {
                return 7;
            }else if (tipoSalida == "E"){
                return 0.95;
            }
            } else if (tipoEntrada == "E") {
                if (tipoSalida == "Bs") {
                    return 9;
                }else if (tipoSalida == "$"){
                    return 1.06;
                }
            }else {
            System.out.println("No se puede realizar la transaccion tipo de cambio equivocado");
        }
        return 0;
    }
}
