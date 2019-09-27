package model;

public abstract class Persona {
    public Persona(String numeroDeDocumento, String tipoDeDocumento, String nombres, String apellidos, String numeroCelular, String numeroTelefono, String correoElectronico, String direccion, String edad, String genero) {
        this.numeroDeDocumento = numeroDeDocumento;
        this.tipoDeDocumento = tipoDeDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCelular = numeroCelular;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.edad = edad;
        this.genero = genero;
    }

    private String numeroDeDocumento;
    private String tipoDeDocumento;
    private String nombres;
    private String apellidos;
    private String numeroCelular;
    private String numeroTelefono;
    private String correoElectronico;
    private String direccion;
    private String edad;
    private String genero;

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void registrar(){
        System.out.println("Registrado con exito");
    }

}
