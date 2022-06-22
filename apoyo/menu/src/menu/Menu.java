/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import javax.swing.JOptionPane;

/**
 *
 * @author kevinf
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Universidad univ = new Universidad("UNAB");
//        
//        univ.agregarDepartamento(new Departamento("Ing. Sistemas"));
//        univ.agregarDepartamento(new Departamento("Ing. Electrónica"));
//        univ.agregarDepartamento(new Departamento("Ing. Civil"));
        
        boolean salir = false;
        String opcion;
        String datosMenu;

        //Crear MENU DE OPCIONES
        do {
//            datosMenu = "*** SISTEMA ACADEMICO " + univ.getNombre() + " ***\n"
            datosMenu = "*** SISTEMA ACADEMICO  ***\n"
                    + "1. Matricular estudiante\n"
                    + "2. Asignar profesor a Departamento\n"
                    + "3. Crear curso en el sistema\n"
                    + "4. Asignar alumnos a un curso\n"
                    + "5. Salir\n"
                    + "\nIngrese opción: ";
//            opcion = Integer.valueOf(JOptionPane.showInputDialog(datosMenu));
             opcion = JOptionPane.showInputDialog(datosMenu);
            switch (opcion) {
                case "1":
                    String nombre;
                    int cod;
                    cod = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código de estudiante a matricular: \n"));
                    nombre = JOptionPane.showInputDialog("Ingrese nombre del estudiante a matricular: \n");
//                    Estudiante e = new Estudiante(nombre, cod);
//                    nombre = JOptionPane.showInputDialog(univ.mostrarDepartamento()+"Ingrese nombre de departamento a matricular: \n");
//                    Departamento d = univ.buscarDepartamento(nombre);
//                    if(d == null) {
//                       JOptionPane.showMessageDialog(null,"El departamento no existe."); 
//                       break;
//                    }
//                    univ.agregarEstudiante(e, d);
                    JOptionPane.showMessageDialog(null, "El estudiante se matriculó con éxito.");
                    break;
                case "2":
                    System.out.println("Opcion 2");
                    break;
                case "3":
                    System.out.println("Opcion 3");
                    break;
                case "4":
                    System.out.println("Opcion 4");
                    break;
                case "5":
                    System.out.println("Opcion 5");
                    salir = true;
                    break;
                default:
                    salir = true;
                    break;
            }
        } while (salir != true);
    }
    
}
