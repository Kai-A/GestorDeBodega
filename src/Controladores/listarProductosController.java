package Controladores;

import BNS.ProductoBSN;
import Modelo.Producto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.util.List;
import java.util.Objects;

public class listarProductosController {

    @FXML
    private TableView<Producto> tblProductos;
    @FXML
    private TableColumn<Producto, String> clmId;
    @FXML
    private TableColumn<Producto, String> clmNombre;
    @FXML
    private TableColumn<Producto, String> clmCategoria;
    @FXML
    private TableColumn<Producto, String> clmSubcategoria;
    @FXML
    private TableColumn<Producto, String> clmValor;
    @FXML
    private TableColumn<Producto, String> clmCantidad;

    @FXML
    private TextField txtBuscarCategoria;
    @FXML
    private  TextField txtBuscarNombre;

    @FXML
    private  TextField txtBuscarSubcategoria;

    private ProductoBSN productoBsn = new ProductoBSN();
    private  Producto productoSeleccionado;

    public listarProductosController(){
        this.productoBsn=new ProductoBSN();
    }

    @FXML
    private void initialize(){
        actualizarLista();
    }
    private void seleccionarProducto(Producto ProductoSeleccionado) {
        this.productoSeleccionado=ProductoSeleccionado;
    }

    public void btnEliminarProducto(){
        productoBsn.eliminarProducto(productoSeleccionado);
        actualizarLista();
    }


    public void actualizarLista(){
        List<Producto> productoList = productoBsn.listarProductos();
        ObservableList<Producto> productosObservables = FXCollections.observableList(productoList);
        tblProductos.setItems(productosObservables);
        clmId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        clmNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        clmCategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategoria()));
        clmSubcategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSubcategoria()));
        clmValor.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getValor())));
        clmCantidad.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getCantidad())));
        tblProductos.getSelectionModel().selectedItemProperty()
                .addListener(((observable, oldValue, newValue) -> seleccionarProducto(newValue)));
    }
    public void btnBuscarCategoria(){
        String categoria= txtBuscarCategoria.getText();
        List<Producto> productoList =  productoBsn.buscarCategoria(categoria);
        ObservableList<Producto> productosObservables = FXCollections.observableList(productoList);
        tblProductos.setItems(productosObservables);
        clmId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        clmNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        clmCategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategoria()));
        clmSubcategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSubcategoria()));
        clmValor.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getValor())));
        clmCantidad.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getCantidad())));
        tblProductos.getSelectionModel().selectedItemProperty()
                .addListener(((observable, oldValue, newValue) -> seleccionarProducto(newValue)));
    }

    public void btnBuscarSubcategoria(){
        String subCategoria= txtBuscarSubcategoria.getText();
        List<Producto> productoList =  productoBsn.buscarSubcategoria(subCategoria);
        ObservableList<Producto> productosObservables = FXCollections.observableList(productoList);
        tblProductos.setItems(productosObservables);
        clmId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        clmNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        clmCategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategoria()));
        clmSubcategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSubcategoria()));
        clmValor.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getValor())));
        clmCantidad.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getCantidad())));
        tblProductos.getSelectionModel().selectedItemProperty()
                .addListener(((observable, oldValue, newValue) -> seleccionarProducto(newValue)));
    }

    public void btnBuscarNombre(){
        String nombre= txtBuscarNombre.getText();
        List<Producto> productoList =  productoBsn.buscarNombre(nombre);
        ObservableList<Producto> productosObservables = FXCollections.observableList(productoList);
        tblProductos.setItems(productosObservables);
        clmId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        clmNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        clmCategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCategoria()));
        clmSubcategoria.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getSubcategoria()));
        clmValor.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getValor())));
        clmCantidad.setCellValueFactory(cellData -> new SimpleStringProperty((cellData.getValue().getCantidad())));
        tblProductos.getSelectionModel().selectedItemProperty()
                .addListener(((observable, oldValue, newValue) -> seleccionarProducto(newValue)));}


    public void btnMostrarLista(){
        actualizarLista();
    }

}
