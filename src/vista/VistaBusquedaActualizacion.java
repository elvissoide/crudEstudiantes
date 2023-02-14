package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VistaBusquedaActualizacion extends JFrame{
    public JTextField idtextField;
    public JTextField nombretextField;
    public JTextField apellidotextField;
    public JTextField celulartextField;
    public JTextField correotextField;
    public JButton buscarButton;
    public JButton actualizarButton;
    private JPanel panelVista1;

    public VistaBusquedaActualizacion(){
        setContentPane(panelVista1);
        pack();
        setTitle("SISTEMA");
        setLocation(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("HOLA");
            }
        });
         */
    }
}
