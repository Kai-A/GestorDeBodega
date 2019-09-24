package Controladores;

import Modelo.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;



public class registrarProductoController {
    @FXML
    private TextField txtNombreProducto;
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtCategoria;
    @FXML
    private TextField txtSubCategoria;
    @FXML
    private TextField txtCantidad;
    @FXML
    private TextField txtValor;

    public void btnGuardarProducto(){
            int dato = Integer.parseInt(txtCantidad.getText());
            int d = Integer.parseInt(txtValor.getText());
            Producto producto = new Producto(txtNombreProducto.getText(), txtID.getText(), txtCategoria.getText(), txtSubCategoria.getText(), dato, d);
    }
}
