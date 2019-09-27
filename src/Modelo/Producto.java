package Modelo;

public class Producto {
    private String nombre;
    private String id;
    private String categoria;
    private String subcategoria;
    private String cantidad;
    private String valor;

    public Producto(String nombre, String id, String categoria, String subcategoria, String cantidad, String valor) {
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.cantidad = cantidad;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getSubcategoria() {
        return subcategoria;
    }

    public void setSubcategoria(String subcategoria) {
        this.subcategoria = subcategoria;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
