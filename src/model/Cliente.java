package model;

public class Cliente extends Persona {


    public Cliente(String numeroDeDocumento, String tipoDeDocumento, String nombres, String apellidos, String numeroCelular, String numeroTelefono, String correoElectronico, String direccion, String genero, String edad) {
        super(numeroDeDocumento, tipoDeDocumento, nombres, apellidos, numeroCelular, numeroTelefono, correoElectronico, direccion, genero, edad);
    }

    public void comprarProductos(){
        System.out.println("Prodcuto comprado");

    }
}
