package controller;

import bsn.PersonaBSN;
import model.Persona;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.List;

public class listarPersonasController {
    @FXML
    private TableView<Persona> tblPersonas;
    @FXML
    private TableColumn<Persona, String> clmIdentifica;
    @FXML
    private TableColumn<Persona, String> clmNombres;
    @FXML
    private TableColumn<Persona, String> clmApellidos;
    @FXML
    private TableColumn<Persona, String> clmDireccion;
    @FXML
    private TableColumn<Persona, String> clmCelular;
    @FXML
    private TableColumn<Persona, String> clmCantidad;

    private PersonaBSN personaBsn = new PersonaBSN();
    private Persona personaSeleccionada;

    public listarPersonasController(){ this.personaBsn=new PersonaBSN();
    }

    @FXML
    private void initialize(){
        actualizarLista();
    }
    private void seleccionarPersona(Persona PersonaSeleccionada) {
        this.personaSeleccionada=PersonaSeleccionada;
    }

    public void btnEliminarPersona(){
        personaBsn.eliminarPersona(personaSeleccionada);
        actualizarLista();
    }


    public void actualizarLista(){
        List<Persona> personaList = personaBsn.listarPersonas();
        ObservableList<Persona> personasObservables = FXCollections.observableList(personaList);
        tblPersonas.setItems(personasObservables);
        clmIdentifica.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNumeroDeDocumento()));
        clmNombres.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombres()));
        clmApellidos.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getApellidos()));
        clmDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        clmCelular.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getNumeroCelular())));
        tblPersonas.getSelectionModel().selectedItemProperty()
                .addListener(((observable, oldValue, newValue) -> seleccionarPersona(newValue)));
    }


}

