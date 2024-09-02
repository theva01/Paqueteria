public class Remitente extends Cliente{

    private String departamento;

    public Remitente(String idCliente, String nombreCompleto, String telefono, String departamento) {
        super(idCliente, nombreCompleto, telefono);
        this.departamento = departamento;
    }

}
