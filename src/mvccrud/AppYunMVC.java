/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccrud;

import Controlador.controlador;
import Controlador.ctrlProducto;
import Modelo.Cliente;
import Modelo.consultasCliente;
import Vista.Principal;
import Vista.cargarClientes;

/**
 *
 * @author facue
 */
public class AppYunMVC {
    public static void main(String[] args) {
    Cliente cli = new Cliente();
    Principal pri = new Principal();
    consultasCliente cc = new consultasCliente();
    cargarClientes cargar = new cargarClientes();
    controlador con = new controlador(cli, cc, cargar, pri); 
    con.Iniciar();
    pri.setVisible(true);
    }

    
}
