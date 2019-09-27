package Controladores;

import BNS.ProductoBSN;
import Modelo.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import static java.lang.Integer.parseInt;


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

    private ProductoBSN productoBSN=new ProductoBSN();

    public void btnGuardarProducto(){
        boolean formularioValido = validarCampos(txtNombreProducto.getText(), txtID.getText(), txtCategoria.getText(), txtSubCategoria.getText(), txtCantidad.getText(), txtValor.getText());
        if (formularioValido) {
            Producto producto = new Producto(txtNombreProducto.getText().trim(), txtID.getText().trim(), txtCategoria.getText().trim(), txtSubCategoria.getText().trim(), txtValor.getText().trim(), txtCantidad.getText().trim());
            productoBSN.guardarProducto(producto);
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Guardado de productos");
            alert.setHeaderText("Melo funcionó");
            alert.setContentText(producto.getNombre()+" fue guardado exitosamente");
            alert.showAndWait();
            limpiarCampos();
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Guardado de productos");
            alert.setHeaderText("Si no sabemos escribir...");
            alert.setContentText("Digite los datos correctamente");
            alert.showAndWait();

        }

    }
    private boolean validarCampos(String... campos) {
        boolean valido = true;
        for (String campo : campos) {
            if (campo == null || "".equals(campo.trim())) {
                valido = false;
                break;
            }
        }
        return valido;
    }
    @FXML
    private void limpiarCampos() {
        txtID.setText("");
        txtNombreProducto.setText("");
        txtValor.setText("");
        txtCantidad.setText("");
        txtCategoria.setText("");
        txtSubCategoria.setText("");

    }
public  void btnLimpiar(){
        limpiarCampos();
}

}
