package DAO;

import Modelo.Producto;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductoDAOList implements ProductoDAO {
private  static List<Producto> productos = new ArrayList();
    @Override
    public void guardarProducto(Producto producto) {
        /*Optional<Producto> respuesta = buscarProductoPorId(producto.getId());
        if (respuesta.isPresent()) {
            productos.remove(respuesta.get());
        }*/
        productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        productos.remove(producto);
    }
    
    @Override
    public List<Producto> listarProductos() {
        return productos;
    }

    private Optional<Producto> buscarProductoPorId(String id) {
        Optional<Producto> productoOptional = Optional.empty();
        for (Producto producto : productos) {
            if (id.equals(producto.getId())) {
                productoOptional = Optional.of(producto);
                break;
            }
        }

        return productoOptional;
    }
}
