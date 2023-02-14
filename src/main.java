import controlador.Controlador;
import vista.VistaBusquedaActualizacion;

public class main {
    public static void main(String[] args) {
        VistaBusquedaActualizacion vba = new VistaBusquedaActualizacion();
        new Controlador(vba);
        vba.setVisible(true);
    }
}
