package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Controller {
    @FXML
    private BorderPane contenedorPrincipal;

    public void btnCerrar(){
        System.exit(0);
    }

    public  void btnRegistrar(){
        try {
            FXMLLoader cargador = new FXMLLoader(getClass().getResource("../view/registrar-persona.fxml"));
            BorderPane vistaRegistrarPersona = cargador.load();
            contenedorPrincipal.setCenter(vistaRegistrarPersona);

        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void mnuRegistrarProducto(){
        try{
            FXMLLoader cargador = new FXMLLoader(getClass().getResource("../view/registrar-producto.fxml"));
            BorderPane vistaRegistrarProducto = cargador.load();
            contenedorPrincipal.setCenter(vistaRegistrarProducto);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public void btnListarProductos(){
        try{
            FXMLLoader cargador = new FXMLLoader(getClass().getResource("../view/listar-productos.fxml"));
            AnchorPane vistaListarProducto = cargador.load();
            contenedorPrincipal.setCenter(vistaListarProducto);
     }catch(IOException e){
         e.printStackTrace();
     }
}
    public void btnListarPersonas(){
        try {
            FXMLLoader cargador = new FXMLLoader(getClass().getResource("../view/listar-personas.fxml"));
            AnchorPane vistaListarPersonas = cargador.load();
            contenedorPrincipal.setCenter(vistaListarPersonas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
