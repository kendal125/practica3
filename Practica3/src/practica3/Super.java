/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
public class Super {
    /*
    nombre del super
    codigo del super
    codigo producto
    nombre del empleado que agrego el producto
    cedula del empleado que agrego el producto
    cantidad de productos a ingresar
    precio base del producto
    tipo de productos (alimentos, bebidas,higiene y limpieza)
    precio bruto del producto (precio final del producto)
    ganacia esperada ((preciobruto-preciobase)*cantidaddeproductos)
    */
    private String nombreSuper;
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
    private int matriz[];

    

    public Super() {
       cantidadProductos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de productos"));
       this.productos = new String[cantidadProductos];
       this.matriz = new int [cantidadProductos];
       solProductos();
       llenaLaMatriz();
       printProductos();
    }
     public void solProductos (){
        for (int i = 0; i < cantidadProductos; i++) {
            productos[i]=JOptionPane.showInputDialog("Digita el producto numero "+ (i+1));
        }
    }
    public String printProductos(){
        String resultado="productos: {";
        for (int i = 0; i < cantidadProductos; i++) {
            resultado+=productos[i]+",";
        }
        resultado+="}";
        resultado+="\nmatriz: {\n";
            for (int i = 0; i < cantidadProductos; i++) {
               resultado+=matriz[i] + "-";
            }
        resultado+="}\n\n";
        return resultado;
        //JOptionPane.showMessageDialog(null, resultado);
    }
    public void llenaLaMatriz(){
            for (int i = 0; i < cantidadProductos; i++) {
                Random rand = new Random();
                matriz[i]=rand.nextInt(9);
            }
        }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public String[] getProductos() {
        return productos;
    }

    public void setProductos(String[] productos) {
        this.productos = productos;
    }

    public int getCodigoSuper() {
        return codigoSuper;
    }

    public void setCodigoSuper(int codigoSuper) {
        this.codigoSuper = codigoSuper;
    }

    public int getCodigoProducto() {
        return codigoProducto;
    }

    public void setCodigoProducto(int codigoProducto) {
        this.codigoProducto = codigoProducto;
    }

    public String getNombreEmple() {
        return nombreEmple;
    }

    public void setNombreEmple(String nombreEmple) {
        this.nombreEmple = nombreEmple;
    }

    public int getCedulaEmple() {
        return cedulaEmple;
    }

    public void setCedulaEmple(int cedulaEmple) {
        this.cedulaEmple = cedulaEmple;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public double getPrecioProductos() {
        return precioProductos;
    }

    public void setPrecioProductos(double precioProductos) {
        this.precioProductos = precioProductos;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioBrutoP() {
        return precioBrutoP;
    }

    public void setPrecioBrutoP(double precioBrutoP) {
        this.precioBrutoP = precioBrutoP;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public int[] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[] matriz) {
        this.matriz = matriz;
    }

    @Override
    public String toString() {
        return "Super{" + "nombreSuper=" + nombreSuper + ", productos=" + productos + ", codigoSuper=" + codigoSuper + ", codigoProducto=" + codigoProducto + ", nombreEmple=" + nombreEmple + ", cedulaEmple=" + cedulaEmple + ", cantidadProductos=" + cantidadProductos + ", precioProductos=" + precioProductos + ", tipoProducto=" + tipoProducto + ", precioBrutoP=" + precioBrutoP + ", ganancia=" + ganancia + ", matriz=" + matriz + '}';
    }
    
    }
    
  //  public String calcularProductoBruto (){
        
//}