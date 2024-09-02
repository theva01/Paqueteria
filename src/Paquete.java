public class Paquete extends Servicio{

    private double peso;

    public Paquete(String idServicio, String tipoServicio, double valorBase, boolean esInternacional, double peso) {
        super(idServicio, tipoServicio, valorBase, esInternacional);
        this.peso = peso;
    }

    @Override
    public double CalcularCosto() {
        return valorBase * peso;
    }

}
