public class Caja extends Servicio{

    private double tarifaAdicional;
    private double volumen;

    public Caja(String idServicio, String tipoServicio, double valorBase, boolean esInternacional, double tarifaAdicional, double volumen) {
        super(idServicio, tipoServicio, valorBase, esInternacional);
        this.tarifaAdicional = tarifaAdicional;
        this.volumen = volumen;
    }

    @Override
    public double CalcularCosto() {
        return valorBase + tarifaAdicional;
    }

}
