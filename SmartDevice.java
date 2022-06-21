public class SmartDevice {
    protected double tamPantalla;
    protected String tipoPantalla;
    protected String sistemaOperativo;
    protected int anioFabricacion;
    protected String madeIn;
    protected String modelo;

    protected String marca;
    protected int duracionBateria;

    public SmartDevice() {}

    public SmartDevice(double tamPantalla, String tipoPantalla, String sistemaOperativo, int anioFabricacion, String madeIn, String modelo, String marca, int duracionBateria) {
        this.tamPantalla = tamPantalla;
        this.tipoPantalla = tipoPantalla;
        this.sistemaOperativo = sistemaOperativo;
        this.anioFabricacion = anioFabricacion;
        this.madeIn = madeIn;
        this.modelo = modelo;
        this.marca = marca;
        this.duracionBateria = duracionBateria;
    }

}
