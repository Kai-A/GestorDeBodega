package DAO;

import Modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductoDAOList implements ProductoDAO {
private  static List<Producto> productos = new ArrayList();
    @Override
    public void guardarProducto(Producto producto) {
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }

    @Override
    public List<Producto> listarProductos() {
        return productos;
    }
}
