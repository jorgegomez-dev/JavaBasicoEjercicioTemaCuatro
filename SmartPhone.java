public class SmartPhone extends SmartDevice{
    double versionSO;
    double resolucionCamPrincipal;
    double resolucionCamFrontal;

    public SmartPhone() {}

    public SmartPhone(double tamPantalla, String tipoPantalla, String sistemaOperativo, int anioFabricacion, String madeIn, String modelo, String marca, int duracionBateria, double versionSO, double resolucionCamPrincipal, double resolucionCamFrontal) {
        super(tamPantalla, tipoPantalla, sistemaOperativo, anioFabricacion, madeIn, modelo, marca, duracionBateria);
        this.versionSO = versionSO;
        this.resolucionCamPrincipal = resolucionCamPrincipal;
        this.resolucionCamFrontal = resolucionCamFrontal;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", versionSO=" + versionSO +
                ", anioFabricacion=" + anioFabricacion +
                ", madeIn='" + madeIn + '\'' +
                ", resolucionCamPrincipal=" + resolucionCamPrincipal + "Mpx. " +
                ", resolucionCamFrontal=" + resolucionCamFrontal + "Mpx. " +
                ", tamPantalla=" + tamPantalla + " pulgadas. " +
                ", tipoPantalla='" + tipoPantalla + '\'' +
                ", duracionBateria=" + duracionBateria + " dias. " +
                '}';
    }
}
