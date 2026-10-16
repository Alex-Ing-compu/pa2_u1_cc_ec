package com.edu.ec.negocio;

 
public class Pedido {
 
 
    private String Cliente;
    private String Producto;
    private double Total;
    private String Correo;
 
   
    public String getCliente() {
        return Cliente;
    }
    public void setCliente(String cliente) {
        Cliente = cliente;
    }
    public String getProducto() {
        return Producto;
    }
    public void setProducto(String producto) {
        Producto = producto;
    }
    public double getTotal() {
        return Total;
    }
    public void setTotal(double total) {
        Total = total;
    }
    public String getCorreo() {
        return Correo;
    }
    public void setCorreo(String correo) {
        Correo = correo;
    }
 
 
    public Pedido(String cliente, String producto, int total, String correo) {
        Cliente = cliente;
        Producto = producto;
        Total = total;
        Correo = correo;
    }
 
   
}
 
