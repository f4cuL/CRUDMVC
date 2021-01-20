/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import Modelo.consultasCliente;
import Vista.Principal;
import Vista.cargarClientes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author facue
 */
public class controlador implements ActionListener{
    private Cliente cli;
    private Principal pri;
    private consultasCliente cc;
    private cargarClientes cargar;
    
    public controlador(Cliente cli, consultasCliente cc, cargarClientes cargar, Principal pri)
    {
        this.cli=cli;
        this.cc=cc;
        this.cargar=cargar;
        this.pri=pri;
        this.pri.btnCargarClientes.addActionListener(this);
        
    }
    public void Iniciar() {
        pri.setTitle("Moto Rudy");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== pri.btnCargarClientes)
        {
            try {          
            cargar.setVisible(true);
            pri.desktop.add(cargar,0);
            }catch (Exception error) {
                System.out.println(error);
            }

        }
      }
}
