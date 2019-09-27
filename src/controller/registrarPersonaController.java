package controller;

import bsn.PersonaBSN;
import javafx.scene.control.CheckBox;
import model.Cliente;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Empleado;
import model.Persona;

public class registrarPersonaController {
    @FXML
    private TextField txtTipoDeDocumento;
    @FXML
    private TextField txtNumeroDeDocumento;
    @FXML
    private TextField txtNombres;
    @FXML
    private TextField txtApellidos;
    @FXML
    private TextField txtGenero;
    @FXML
    private TextField txtEdad;
    @FXML
    private TextField txtNumeroDeCelular;
    @FXML
    private TextField txtNumeroDeTelefono;
    @FXML
    private TextField txtCorreoElectronico;
    @FXML
    private TextField txtDireccionDeResidencia;
    @FXML
    private CheckBox chkEsEmpleado;

    private PersonaBSN personaBSN=new PersonaBSN();

    public void btnGuardarPersona(){
        boolean formularioValido = validarCampos(txtTipoDeDocumento.getText(), txtNumeroDeDocumento.getText(), txtNombres.getText(),txtApellidos.getText(), txtGenero.getText(), txtEdad.getText(), txtNumeroDeCelular.getText(), txtNumeroDeTelefono.getText(), txtCorreoElectronico.getText(), txtDireccionDeResidencia.getText());
        if (formularioValido) {
            Persona p;
            if(chkEsEmpleado.isSelected()){
                p  = new Empleado(txtNumeroDeDocumento.getText().trim(), txtTipoDeDocumento.getText().trim(), txtNombres.getText().trim(), txtApellidos.getText().trim(), txtNumeroDeCelular.getText().trim(), txtNumeroDeTelefono.getText().trim(), txtCorreoElectronico.getText().trim(), txtDireccionDeResidencia.getText().trim(), txtGenero.getText().trim(), txtEdad.getText().trim());
            }else {
                p = new Cliente(txtNumeroDeDocumento.getText().trim(), txtTipoDeDocumento.getText().trim(), txtNombres.getText().trim(), txtApellidos.getText().trim(), txtNumeroDeCelular.getText().trim(), txtNumeroDeTelefono.getText().trim(), txtCorreoElectronico.getText().trim(), txtDireccionDeResidencia.getText().trim(), txtGenero.getText().trim(), txtEdad.getText().trim());
            }try {
                personaBSN.guardarPersona(p);
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Guardado de personas");
                alert.setHeaderText("Melo funcionó");
                alert.setContentText(p.getNombres() + " fue guardado exitosamente");
                alert.showAndWait();
                btnLimpiarCampos();
            }catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Guardado de personas");
                alert.setHeaderText("Si no sabemos escribir...");
                alert.setContentText(e.getMessage());
                alert.showAndWait();
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Guardado de personas");
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
    private void btnLimpiarCampos() {
        txtTipoDeDocumento.setText("");
        txtNumeroDeDocumento.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtGenero.setText("");
        txtEdad.setText("");
        txtNumeroDeCelular.setText("");
        txtNumeroDeTelefono.setText("");
        txtCorreoElectronico.setText("");
        txtDireccionDeResidencia.setText("");
    }


}
