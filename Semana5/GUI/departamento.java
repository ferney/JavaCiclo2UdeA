
package GUI;

public class departamento {
    private String nombre,localizacion;

    public departamento(String nombre, String localizacion) {
        this.nombre = nombre;
        this.localizacion = localizacion;
    }

    public departamento() {
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "departamento{" + "nombre=" + nombre + ", localizacion=" + localizacion + '}';
    }
    
}
