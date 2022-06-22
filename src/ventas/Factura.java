/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ventas;

/**
 *
 * @author SALA 306
 */
public class Factura {
    private float total;
    public Cliente micliente;
    public Producto miproducto;

    public Factura() {
    }

    public Factura(float total, Cliente micliente, Producto miproducto) {
        this.total = total;
        this.micliente = micliente;
        this.miproducto = miproducto;
    }
    
    public void generarFactura(Cliente cliente, Producto producto)
    {
        micliente=cliente;
        miproducto=producto;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getMicliente() {
        return micliente;
    }

    public void setMicliente(Cliente micliente) {
        this.micliente = micliente;
    }

    public Producto getMiproducto() {
        return miproducto;
    }

    public void setMiproducto(Producto miproducto) {
        this.miproducto = miproducto;
    }
    
    
}
