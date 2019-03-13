/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author socamporomani
 */
public class Boletin15_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto MiBand = new Producto("C1", 24);
        Producto HomeCinema = new Producto("H23", 234);
        Producto XboxOne = new Producto("M30", 109);

        JOptionPane.showMessageDialog(null, Producto.Factura(MiBand, HomeCinema, XboxOne));
        try {
            HomeCinema.setProducto();
        } catch (CodigoException e1) {
            JOptionPane.showMessageDialog(null, e1.getMessage());
} catch (NumberFormatException e2) {
    JOptionPane.showMessageDialog(null, "Número incorrecto");
}
        JOptionPane.showMessageDialog(null, Producto.Factura(MiBand, HomeCinema, XboxOne));

    }

}
