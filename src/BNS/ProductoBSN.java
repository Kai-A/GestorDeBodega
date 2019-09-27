package BNS;

import DAO.ProductoDAO;
import DAO.ProductoDAOList;
import Modelo.Producto;

import java.util.List;

public class ProductoBSN {
    private ProductoDAOList productoDAO;

    public ProductoBSN(){
        productoDAO= new ProductoDAOList();
    }

    public void guardarProducto(Producto producto) {
        //todo validar reglas de negocio
        productoDAO.guardarProducto(producto);

    }
    public void eliminarProducto(Producto producto){
        productoDAO.eliminarProducto(producto);
    }
    public List<Producto> listarProductos() {
        return productoDAO.listarProductos();
    }
}
