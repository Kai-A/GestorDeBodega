package Modelo;

public abstract class Persona {

    private String numeroDeDocumento;
    private String nombres;
    private String apellidos;
    private String numeroCelular;
    private String numeroTelefono;
    private String correoElectronico;
    private String direccion;

    public void registrar(){
        System.out.println("Registrado con exito");
    }

}
