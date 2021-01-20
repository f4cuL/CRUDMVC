/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvccrud;

import Controlador.ctrlProducto;
import Modelo.Producto;
import Modelo.consultasProducto;
import Vista.frmProducto;

/**
 *
 * @author facue
 */
public class CRUDMVC {

    public static void main(String[] args) {
        Producto mod= new Producto();
        consultasProducto modC = new consultasProducto();
        frmProducto frm = new frmProducto();
        ctrlProducto ctrl = new ctrlProducto(mod, modC, frm);
        ctrl.Iniciar();
        frm.setVisible(true);
    }
    
}
