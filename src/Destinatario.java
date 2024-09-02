public class Destinatario extends Cliente{

    private String calle;
    private String ciudad;
    private String pais;

    public Destinatario(String idCliente, String nombreCompleto, String telefono, String calle, String ciudad, String pais) {
        super(idCliente, nombreCompleto, telefono);
        this.calle = calle;
        this.ciudad = ciudad;
        this.pais = pais;
    }

}
