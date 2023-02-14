package controlador;

import modelo.Usuario;
import modelo.UsuarioManipulacion;
import vista.VistaBusquedaActualizacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener {
    UsuarioManipulacion um = new UsuarioManipulacion();
    VistaBusquedaActualizacion vba = new VistaBusquedaActualizacion();
    Usuario u = new Usuario();

    public Controlador(VistaBusquedaActualizacion vbac){
        this.vba = vbac;
        this.vba.buscarButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vba.buscarButton){
            System.out.println("Se presiona boton buscar");
            //int id = Integer.parseInt(vba.idtextField.getText());
            //buscar(id);
        }
    }

    public void buscar(int id){
        u = um.buscar(id);
        vba.idtextField.setText(String.valueOf(u.getId()));
        vba.nombretextField.setText(u.getNombre());
        vba.apellidotextField.setText(u.getApellido());
        vba.celulartextField.setText(u.getCelular());
        vba.correotextField.setText(u.getCorreo());
    }
}
