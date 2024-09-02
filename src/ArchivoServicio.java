import java.util.ArrayList;
import java.util.List;

public class ArchivoServicio {

    private int idArchivo;
    private List<Guia> guias;

    public ArchivoServicio(int idArchivo) {
        this.idArchivo = idArchivo;
        this.guias = new ArrayList<>();
    }

    public void agregarGuia(Guia guia) {
        guias.add(guia);
    }

    public void consultarGuias() {
        for (Guia guia : guias) {
            System.out.println("Guía número: " + guia.getNumeroEnvioGuia());
        }
    }

}
