package dao;

import model.Producto;

import java.util.ArrayList;
import java.util.List;

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

    public List<Producto> buscarCategoria(String Categoria){
        List<Producto> productosBuscadosCategoria = new ArrayList();
        for(Producto producto: productos){
            if(producto.getCategoria().equals(Categoria)){
                productosBuscadosCategoria.add(producto);
            }
        }
        return productosBuscadosCategoria;
    }
    public List<Producto> buscarSubcategoria(String Subcategoria){
        List<Producto> productosBuscadosSubcategoria = new ArrayList();
        for(Producto producto: productos){
            if(producto.getSubcategoria().equals(Subcategoria)){
                productosBuscadosSubcategoria.add(producto);
            }
        }
        return productosBuscadosSubcategoria;
    }
    public List<Producto> buscarNombre(String nombre){
        List<Producto> productosBuscadosNombre = new ArrayList();
        for(Producto producto: productos){
            if(producto.getNombre().equals(nombre)){
                productosBuscadosNombre.add(producto);
            }
        }
        return productosBuscadosNombre;
    }
}
