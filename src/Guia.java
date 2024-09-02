public class Guia {

    private String numeroEnvioGuia;
    private String idServicio;
    private double valorDeclarado;
    private String estado;

    public Guia(String numeroEnvioGuia, String idServicio, double valorDeclarado, String estado) {
        this.numeroEnvioGuia = numeroEnvioGuia;
        this.idServicio = idServicio;
        this.valorDeclarado = valorDeclarado;
        this.estado = estado;
    }

    public String getNumeroEnvioGuia() {
        return numeroEnvioGuia;
    }

    public void registrarGuia() {
    }

    public void registrarEntrega() {
        this.estado = "FINALIZADA";
    }

    public void consultarEstado() {
        System.out.println("El estado de la guía es: " + this.estado);
    }

}
