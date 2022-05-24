package factoryMethod.practice.pasaje;

public class CreatorPasajeInfante extends Creator{
    @Override
    public IPasaje createProduct() {
        Avion boa = new Avion();
        boa.setMarca("BOA");
        boa.setCapacidad(50);
        boa.setModelo("Boeing 747");
        boa.setNumeroAsientos(55);
        Lugar dest = new Lugar();
        dest.setPais("Bolivia");
        dest.setCiudad("Santa Cruz de la Sierra");
        dest.setAeropuerto("Viru Viru");
        Lugar ori = new Lugar();
        ori.setPais("Bolivia");
        ori.setCiudad("La Paz");
        ori.setAeropuerto("Aeropuerto Internacional de El Alto");
        Pasajero def = new Pasajero();
        def.setNombre("default");
        def.setCi("default");
        PasajeInfante pasaje = new PasajeInfante(ori,dest,def,boa);
        pasaje.setCostoEspecial(150);
        pasaje.setNumeroVuelo(125);
        return pasaje;
    }
}
