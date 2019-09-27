package DAO;

import Modelo.Producto;

import java.util.List;

public interface ProductoDAO {
    void guardarProducto(Producto producto);
    List<Producto> listarProductos();

}
