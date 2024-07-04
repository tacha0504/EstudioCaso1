/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estudio.caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author TChaves
 */
public class EstudioCaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Caso de estudio 1: Una empresa nacional requiere un control de facturas, comisiones y puntos que realiza los agentes vendedores de la empresa*/
 /*Se llaman las variables de la clase AgenteVentas y se solicita su valor*/
        AgenteVentas agenteventas = new AgenteVentas();
        agenteventas.agente = JOptionPane.showInputDialog("Digite su nombre como agente de ventas");
        agenteventas.cedula = Integer.parseInt(JOptionPane.showInputDialog("Digite su cedula"));
        agenteventas.codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite su codigo"));
        agenteventas.sucursal = JOptionPane.showInputDialog("Digite la sucursal en la que labora");
        agenteventas.vehiculo = Integer.parseInt(JOptionPane.showInputDialog("Si posee vehiculo digite 1, sino posee vehiculo digite 2"));

        /*Se llaman las variables y se solicita su valor de la clase Facturas*/
        Facturas facturas = new Facturas();
        facturas.cantidad_facturas = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de facturas a agregar"));
        /*Se le asigna el nombre del mes según el número de mes recibido*/
        String mes = null;
        switch (facturas.mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero del mes (1-12)"))) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
            case 3:
                mes = "Marzo";
            case 4:
                mes = "Abril";
            case 5:
                mes = "Mayo";
            case 6:
                mes = "Junio";
            case 7:
                mes = "Julio";
            case 8:
                mes = "Agosto";
            case 9:
                mes = "Setiembre";
            case 10:
                mes = "Octubre";
            case 11:
                mes = "Noviembre";
            case 12:
                mes = "Diciembre";

        }
        /*Se asignan diferentes bonos y puntos segün total de ventas, tipo de ventas y cantidades*/
        double bonoextra = 0;
        double bono1 = 0;
        double bono2 = 0;
        double bono3 = 0;
        double bono4 = 0;
        double bonototal = 0;
        int puntos0 = 0;
        int puntos1 = 0;
        int puntos2 = 0;
        int puntos3 = 0;
        int puntos4 = 0;
        int puntostotal = 0;
        double total = 0;
        int facturamayor = 0;
        /*Se llaman variables de la clase Facturas*/
        for (int i = 1; i <= facturas.cantidad_facturas; i++) {
            facturas.cliente = JOptionPane.showInputDialog("Digite el nombre del cliente");
            facturas.cedula_cliente = Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula del cliente"));
            facturas.codigo_factura = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo de la factura"));
            facturas.monto = Integer.parseInt(JOptionPane.showInputDialog("Digite el monto de la factura"));
            total = total + facturas.monto;
            facturas.prod_automotrices = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos automotrices"));
            facturas.prod_construccion = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos de construcción"));
            facturas.prod_electricos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos electricos"));
            if (facturas.monto > 50000) {
                facturamayor = facturas.monto;
                total = total * 0.05;
                puntos0 = 1;
            }
        }
        /*Se generan operaciones para asignación de bonos según el monto de facturas y los productos que se venden*/
        if (facturas.prod_automotrices > 0 && facturas.prod_construccion > 0 && facturas.prod_electricos > 0) {
            bono1 = facturamayor * 0.10;
            puntos1 = 3;
        }
        if (facturas.prod_electricos >= 3) {
            bono2 = facturas.monto * 0.04;
            puntos2 = 1;
            if (facturas.prod_electricos < 3) {
                puntos2 = 1;
                bono2 = facturas.monto * 0.02;
            }
            if (facturas.prod_automotrices > 4) {
                bono3 = facturas.monto * 0.04;
                puntos3 = 1;
            }
            if (facturas.prod_automotrices < 4) {
                puntos3 = 1;
                bono3 = facturas.monto * 0.02;
            }
            if (facturas.prod_construccion > 0) {
                puntos4 = 2;
                bono4 = facturas.monto * 0.08;
            }
            /*Se presenta en pantalla los datos del cliente, comisiones, ventas y puntos obtenidos*/
            JOptionPane.showMessageDialog(null, "El agente vendedor " + agenteventas.agente + "codigo " + agenteventas.codigo + "en el mes de" + mes);
            JOptionPane.showMessageDialog(null, "Vendió un total de: " + total + "en facturas");
            if (facturas.cantidad_facturas > 10 || total > 300000) {
                bonoextra = 20000;
            } else {
                JOptionPane.showMessageDialog(null, "El agente vendedor no logro llegar al bono extra");
            }
            bonototal = bonoextra + bono1 + bono2 + bono3 + bono4;
            JOptionPane.showMessageDialog(null, "Obtuvo un total de comisiones de: " + bonototal);
            puntostotal = puntos0 + puntos1 + puntos2 + puntos3 + puntos4;
            JOptionPane.showMessageDialog(null, "Puntos obtenidos por el vendedor: " + puntostotal);
            if (agenteventas.vehiculo == 1) {
                JOptionPane.showMessageDialog(null, "El vendedor si cuenta con vehiculo propio");
            }
            JOptionPane.showMessageDialog(null, "Sucursal: " + agenteventas.sucursal);

        }
    }
}
