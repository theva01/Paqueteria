public abstract class Servicio {

    protected String idServicio;
    protected String tipoServicio;
    protected double valorBase;
    protected boolean esInternacional;

    public Servicio(String idServicio, String tipoServicio, double valorBase, boolean esInternacional) {
        this.idServicio = idServicio;
        this.tipoServicio = tipoServicio;
        this.valorBase = valorBase;
        this.esInternacional = esInternacional;
    }

    public abstract double CalcularCosto();

}
