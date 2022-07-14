/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogui;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class principal {
    public static void main(String[] args) {
        empleado emp= new empleado();
        crud crud= new crud();
        ui gui= new ui();
        controlador con= new controlador(emp, crud, gui);
        con.iniciar();
        gui.setVisible(true);
    }
}
