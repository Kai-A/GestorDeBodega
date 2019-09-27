package model;

public class Empleado extends Persona {
    public Empleado(String numeroDeDocumento, String tipoDeDocumento, String nombres, String apellidos, String numeroCelular, String numeroTelefono, String correoElectronico, String direccion, String edad, String genero) {
        super(numeroDeDocumento, tipoDeDocumento, nombres, apellidos, numeroCelular, numeroTelefono, correoElectronico, direccion, edad, genero);
    }

    public  void modificar(){}

    public void listar(){}

    public void buscar(){}

    public void eliminar(){}
}
