
package demoherencia;

/**
 *
 * @author juanm
 */
public class Cliente {
    
    private String nombre;
    private String apellidos;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String numeroTelefonico;
    private String email;
    
    public Cliente(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaDeNacimiento = "Día. mes, año";
        this.direccion = "Colonia, calle";
        this.ocupacion = "Desconocida";
        this.numeroTelefonico = "(LADA)-***-***)";
        this.email = "ejemplo@ejemplo.com";
    }
    
     
    public String getNombreDelCliente(){
        return this.nombre;
    }
    public String getApellidosDelCliente(){
        return this.apellidos;
    }
    public String getFechaDeNacimiento(){
        return this.fechaDeNacimiento;
    }
    public String getDireccionDelCliente(){
        return this.direccion;
    }
    public String getOcupacionDelCliente(){
        return this.ocupacion;
    }
    public String getNumeroDeTelefono(){
        return this.numeroTelefonico;
    }
    public String getEmailDelCliente(){
        return this.email;
    }
} 
   