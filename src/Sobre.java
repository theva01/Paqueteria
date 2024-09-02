public class Sobre extends Servicio{

    private double tarifaFija;

    public Sobre(String idServicio, String tipoServicio, double valorBase, boolean esInternacional, double tarifaFija) {
        super(idServicio, tipoServicio, valorBase, esInternacional);
        this.tarifaFija = tarifaFija;
    }

    @Override
    public double CalcularCosto() {
        return valorBase + tarifaFija;
    }

}
