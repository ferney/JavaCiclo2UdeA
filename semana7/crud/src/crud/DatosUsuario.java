
package crud;

/**
 *
 * @author FERNEY CHAPARRO
 */
public class DatosUsuario {
    private String cedula, nombre, apellido, telefono;
    public DatosUsuario(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }
    public DatosUsuario() {}
    public String getCedula() {return cedula;    }
    public void setCedula(String cedula) {this.cedula = cedula;  }
    public String getNombre() {return nombre; }
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}  
}
