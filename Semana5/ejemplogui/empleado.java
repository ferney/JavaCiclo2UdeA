package ejemplogui;
public class empleado {
       private int id;
	private String nombre;
	private String apellido;
	private String sexo;
	private double salario;
        private double total;

    public empleado(int id, String nombre, String apellido, String sexo, double salario, double total) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.salario = salario;
        this.total = total;
    }

    empleado() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido_) {
        this.apellido = apellido_;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return  "id=" + id + ", nombre=" + nombre + ", apellido_=" + apellido + ", sexo=" + sexo + ", salario=" + salario + ", total=" + total + '}';
    }

    
        
}
