/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class Practica3 {

    /**
     *     private String nombreSuper;
    private String productos [];
    private int codigoSuper;
    private int codigoProducto;
    private String nombreEmple;
    private int cedulaEmple;
    private int cantidadProductos=0;
    private double precioProductos;
    private String tipoProducto;
    private double precioBrutoP;
    private double ganancia;
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Super chino = new Super();
    String respuesta="";
    respuesta+=chino.printProductos();
    JOptionPane.showMessageDialog(null, respuesta);
    }
}