package prototype.practice.celulares;

public class Client {
    public static void main(String[]args) {

        Celular template = new Celular();
        template.setTamano("5.8 pulgadas");
        template.setCpu("Exynos 9820");
        template.setMemory(8);
        template.setVersionAndroid(9);
        template.setCamara("Triple, 12MP+12MP+16MP");
        template.setBluetooth(5);
        template.setCantidadMemoriasExternas(2);
        template.setTipoBateria("iones de litio de 3,400 mAh no desmontable");

        Sim cel1 = new Sim();
        cel1.setNombreEmpresaTel("ENTEL");
        cel1.setNumeroTelefono(72080117);

        Sim cel2 = new Sim();
        cel2.setNombreEmpresaTel("VIVA");
        cel2.setNumeroTelefono(71242222);

        Sim cel3 = new Sim();
        cel3.setNombreEmpresaTel("TIGO");
        cel3.setNumeroTelefono(74555899);

        Accesorios acc1 = new Accesorios();
        acc1.setEstuche("Transparente");
        acc1.setCargador("Cargador Rápido Adaptativo");
        acc1.setAudifono("Galaxy Buds");

        Accesorios acc2 = new Accesorios();
        acc2.setEstuche("Rojo");
        acc2.setAudifono("Galaxy Buds+");
        acc2.setCargador("Cargador Rápido Tipo USB-C 25W");

        Accesorios acc3 = new Accesorios();
        acc3.setEstuche("Azul");
        acc3.setCargador("Cargador Almohadilla Inalámbrica");
        acc3.setAudifono("Gear IconX");

        Celular celular1 = (Celular) template.clone();
        celular1.setSim(cel1);
        celular1.setAccesorios(acc1);

        Celular celular2 = (Celular) template.clone();
        celular2.setSim(cel2);
        celular2.setAccesorios(acc2);

        Celular celular3 = (Celular) template.clone();
        celular3.setSim(cel3);
        celular3.setAccesorios(acc3);

        celular1.showInfo();
        celular2.showInfo();
        celular3.showInfo();
    }
}
