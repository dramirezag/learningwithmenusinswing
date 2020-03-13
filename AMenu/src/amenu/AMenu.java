/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Diego Ramirez
 */
public class AMenu extends JFrame implements ActionListener {

    private JMenuBar mb;
    private JMenu menuArchivo, menuAyuda, subMenuGuardar;
    private JMenuItem opcionNuevo, opcionGuardar, opcionGuardarComo, opcionSalir, opcionAcercade, opcionAyuda;
    private JLabel imprimirOpcion;

    /**
     *
     * UtilidadHilos with one parameter constructor
     *
     * Defines the title for the frame using the variable title
     *
     * @param title an <code>String</code> value for the title
     *
     */
    public AMenu(String title) {
        super(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(10, 10, 300, 300);
        getContentPane().setLayout(null);

        mb = new JMenuBar();
        setJMenuBar(mb);

        menuArchivo = new JMenu("Archivo");
        mb.add(menuArchivo);

        opcionNuevo = new JMenuItem("Nuevo");
        opcionNuevo.addActionListener(this);
        menuArchivo.add(opcionNuevo);

        subMenuGuardar = new JMenu("Guardar...");
        menuArchivo.add(subMenuGuardar);

        opcionGuardar = new JMenuItem("Guardar");
        opcionGuardar.addActionListener(this);
        subMenuGuardar.add(opcionGuardar);

        opcionGuardarComo = new JMenuItem("Guardar como");
        opcionGuardarComo.addActionListener(this);
        subMenuGuardar.add(opcionGuardarComo);

        menuArchivo.addSeparator();

        opcionSalir = new JMenuItem("Salir");
        opcionSalir.addActionListener(this);
        menuArchivo.add(opcionSalir);

        menuAyuda = new JMenu("Ayuda");
        mb.add(menuAyuda);

        opcionAcercade = new JMenuItem("Acerca de");
        opcionAcercade.addActionListener(this);
        menuAyuda.add(opcionAcercade);

        opcionAyuda = new JMenuItem("Ayuda");
        opcionAyuda.addActionListener(this);
        menuAyuda.add(opcionAyuda);

        imprimirOpcion = new JLabel("Selecciona opcion de menu");
        imprimirOpcion.setBounds(10, 40, 160, 110);
        getContentPane().add(imprimirOpcion);

    }

    /**
     *
     * actionPerformed method
     *
     * Listen to the press of the two buttons and executes actions accordingly
     *
     * @param e <code>ActionEvent</code> object
     *
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == opcionNuevo) {

            imprimirOpcion.setText(opcionNuevo.getText());

        }

        if (e.getSource() == opcionGuardar) {

            imprimirOpcion.setText(opcionGuardar.getText());

        }

        if (e.getSource() == opcionGuardarComo) {

            imprimirOpcion.setText(opcionGuardarComo.getText());

        }

        if (e.getSource() == opcionSalir) {

            imprimirOpcion.setText(opcionSalir.getText());

        }

        if (e.getSource() == opcionAcercade) {

            imprimirOpcion.setText(opcionAcercade.getText());

        }

        if (e.getSource() == opcionAyuda) {

            imprimirOpcion.setText(opcionAyuda.getText());

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        AMenu f = new AMenu("Aplicacion Menus");
        f.setVisible(true);
    }

}
