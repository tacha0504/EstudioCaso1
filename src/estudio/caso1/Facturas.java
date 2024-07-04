/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.caso1;

/**
 *
 * @author TChaves
 */
public class Facturas {

    /*Se inicializan las variables sobre los datos a llenar en la factura*/
    public String cliente;
    public int cedula_cliente;
    public int codigo_factura;
    public int monto;
    public int mes;
    public int prod_electricos;
    public int prod_automotrices;
    public int prod_construccion;
    public int cantidad_facturas;

    public Facturas() {
    }

    /*Se genera el constructor de la clase Facturas*/
    public Facturas(String cliente, int cedula_cliente, int codigo_factura, int monto, int mes, int prod_electricos, int prod_automotrices, int prod_construccion, int cantidad_facturas) {
        this.cliente = cliente;
        this.cedula_cliente = cedula_cliente;
        this.codigo_factura = codigo_factura;
        this.monto = monto;
        this.mes = mes;
        this.prod_electricos = prod_electricos;
        this.prod_automotrices = prod_automotrices;
        this.cantidad_facturas = cantidad_facturas;

    }

}
