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
public class Producto {
    private String codigo;
    private float precio;
    private static int numFactura = 0;

    public Producto(String codigo, float precio) {
        this.codigo = codigo;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public void setProducto() throws CodigoException{
        char c;
        precio=Float.parseFloat(JOptionPane.showInputDialog("Escribir el precio"));   
        codigo=JOptionPane.showInputDialog("Escribir el código");     
        c = codigo.charAt(0);
        if(Character.isDigit(c)) {
            codigo = "ERROR";
            throw new CodigoException("El código debe empezar por una letra y un número");
        }
    }
    public static String Factura(Producto x, Producto y, Producto z){
        numFactura++;
        return "Nº de factura: "+numFactura+"\n"
                + "(Código: "+ x.codigo+", precio: "+x.precio+" euros)\n"
                + "(Código: "+ y.codigo+", precio: "+y.precio+" euros)\n"
                + "(Código: "+ z.codigo+", precio: "+z.precio+" euros)\n";       
    }
}
