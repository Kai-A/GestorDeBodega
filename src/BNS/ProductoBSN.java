package BNS;

import DAO.ProductoDAO;
import DAO.ProductoDAOList;
import Modelo.Producto;
import javafx.scene.control.Alert;

import java.util.List;

public class ProductoBSN {
    private ProductoDAOList productoDAO;

    public ProductoBSN(){
        productoDAO= new ProductoDAOList();
    }

    public void guardarProducto(Producto producto) {
        //todo validar reglas de negocio
        int d = 0;
        int t=0;
        if (verificarSiEsNumero(producto.getCantidad()) && verificarSiEsNumero(producto.getValor())){
            d = Integer.parseInt(producto.getCantidad());
            t=Integer.parseInt(producto.getValor());
            if (d < 0 || t<0 ) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Guardado de productos");
                alert.setHeaderText("¡Hay un error!");
                alert.setContentText("La cantidad y el valor tienen que ser igual o mayor a cero");
                alert.showAndWait();
                return;
            }
        }

        else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Guardado de productos");
                alert.setHeaderText("¡Hay un error!");
                alert.setContentText("¡Tienes que digitar un numero!");
                alert.showAndWait();
                return;
        }
        productoDAO.guardarProducto(producto);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Guardado de productos");
        alert.setHeaderText("Melo funcionó");
        alert.setContentText(producto.getNombre()+" fue guardado exitosamente");
        alert.showAndWait();

    }
    public void eliminarProducto(Producto producto){
        productoDAO.eliminarProducto(producto);
    }
    public List<Producto> listarProductos() {
        return productoDAO.listarProductos();
    }
    public boolean verificarSiEsNumero(String x){
        try {
            Integer.parseInt(x);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }
}
