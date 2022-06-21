public class SmartWatch extends SmartDevice{
    boolean watterProf;
    boolean gps;
    boolean wifi;

    public SmartWatch() {}

    public SmartWatch(double tamPantalla, String tipoPantalla, String sistemaOperativo, int anioFabricacion, String madeIn, String modelo, String marca, int duracionBateria, boolean watterProf, boolean gps, boolean wifi) {
        super(tamPantalla, tipoPantalla, sistemaOperativo, anioFabricacion, madeIn, modelo, marca, duracionBateria);
        this.watterProf = watterProf;
        this.gps = gps;
        this.wifi = wifi;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", anioFabricacion=" + anioFabricacion +
                ", madeIn='" + madeIn + '\'' +
                ", watterProf=" + watterProf +
                ", gps=" + gps +
                ", wifi=" + wifi +
                ", tamPantalla=" + tamPantalla + " pulgadas. " +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", duracionBateria=" + duracionBateria + " dias. " +
                '}';
    }
}
