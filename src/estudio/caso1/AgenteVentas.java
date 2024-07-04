/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudio.caso1;

/**
 *
 * @author TChaves
 */
public class AgenteVentas {

    /*Se inicializan las variables nombre de agente, cedula, codigo y la sucursal donde trabaja*/
    String agente;
    int cedula;
    int codigo;
    String sucursal;
    int vehiculo;

    public AgenteVentas() {
    }

    /*Se genera el constructor de la clase AgenteVentas*/
    public AgenteVentas(String agente, int cedula, int codigo, String sucursal, int vehiculo) {
        this.agente = agente;
        this.cedula = cedula;
        this.codigo = codigo;
        this.sucursal = sucursal;
        this.vehiculo = vehiculo;
    }
}
