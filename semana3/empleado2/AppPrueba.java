

package ejemplo_interface_implementado;

public class AppPrueba 
{
   public static void main(String[] args)
   {
      // se crea un arreglo de nombre objetosPagables de 4 elementos
      Porpagar[] objetosPagables = new Porpagar[4];
      
      // lleno el arreglo con objetos que implementan la interfaz Porpagar
      objetosPagables[0] = new Factura("01234", "Cubierta Aro 15", 2, 256000.00);
      objetosPagables[1] = new Factura("56789", "Llanta Vossen aro 16", 4, 575000.00);
      objetosPagables[2] = new EmpleadoAsalariado("Juan", "Perez", "111111111", 500000.00);
      objetosPagables[3] = new EmpleadoAsalariado("Lisa", "Fernandez", "888888888", 600000.00);

      System.out.println("Facturas y Empleados procesados polimorficamente:"); 

      // se procesa cada elemento
      for (Porpagar porPagarActual : objetosPagables)
      {
          //se imprime porPagarActual y su monto de pago apropiado
         System.out.printf("%n%s %n%s: $%,.2f%n", 
            porPagarActual.toString(), 
            "Pago vencido", porPagarActual.obtenerMontoPago()); 
      } 
   } // fin método main
} // fin app

