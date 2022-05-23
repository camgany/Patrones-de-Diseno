package prototype.practice.celulares;

public class Celular implements ICelular{

    private String tamano;
    private String cpu;
    private int memory;
    private Sim sim = new Sim();
    private int versionAndroid;
    private String camara;
    private int bluetooth;
    private int cantidadMemoriasExternas;
    private String tipoBateria;
    private Accesorios accesorios = new Accesorios();

    public Celular(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public int getVersionAndroid() {
        return versionAndroid;
    }

    public void setVersionAndroid(int versionAndroid) {
        this.versionAndroid = versionAndroid;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    public int getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(int bluetooth) {
        this.bluetooth = bluetooth;
    }

    public int getCantidadMemoriasExternas() {
        return cantidadMemoriasExternas;
    }

    public void setCantidadMemoriasExternas(int cantidadMemoriasExternas) {
        this.cantidadMemoriasExternas = cantidadMemoriasExternas;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Accesorios getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(Accesorios accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public Object clone() {
        Accesorios cloneA = new Accesorios();
        cloneA.setAudifono(this.getAccesorios().getAudifono());
        cloneA.setCargador(this.getAccesorios().getCargador());
        cloneA.setEstuche(this.getAccesorios().getEstuche());

        Sim cloneS = new Sim();
        cloneS.setNombreEmpresaTel(this.getSim().getNombreEmpresaTel());
        cloneS.setNumeroTelefono(this.getSim().getNumeroTelefono());

        Celular clone = new Celular();
        clone.setTamano(this.getTamano());
        clone.setCpu(this.getCpu());
        clone.setMemory(this.getMemory());
        clone.setSim(cloneS);
        clone.setVersionAndroid(this.getVersionAndroid());
        clone.setCamara(this.getCamara());
        clone.setBluetooth(this.getBluetooth());
        clone.setCantidadMemoriasExternas(this.getCantidadMemoriasExternas());
        clone.setTipoBateria(this.getTipoBateria());
        clone.setAccesorios(cloneA);

        return clone;
    }

    public void showInfo(){
        System.out.println("\n ********************************** Registro ***************************** \n");
        System.out.println("\n ---------------- Caracteristicas del celular Samsung S10 ---------------- \n");
        System.out.println("Tamano: " +tamano);
        System.out.println("CPU: "+cpu);
        System.out.println("Memory: "+memory + "GB");
        System.out.println("SIM: ");
        System.out.println("   -Empresa Telefonica: "+sim.getNombreEmpresaTel());
        System.out.println("   -Numero de Telefono: "+sim.getNumeroTelefono());
        System.out.println("Version de Android: "+versionAndroid);
        System.out.println("Camara: "+camara);
        System.out.println("Bluetooth: "+bluetooth);
        System.out.println("Cantidad de Memorias Externas: "+cantidadMemoriasExternas);
        System.out.println("Tipo de Bateria: "+tipoBateria);
        System.out.println("Accesorios: ");
        System.out.println("  -audifonos: "+accesorios.getAudifono());
        System.out.println("  -cargador: "+accesorios.getCargador());
        System.out.println("  -estuche: "+accesorios.getEstuche());
        System.out.println("**************************************************************************");

    }
}
