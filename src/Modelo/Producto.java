package Modelo;

public class Producto {
    private String nombre;
    private String id;
    private String categoria;
    private String subcategoria;
    private int cantidad;
    private int valor;

    public Producto(String nombre, String id, String categoria, String subcategoria, int cantidad, int valor) {
        this.nombre = nombre;
        this.id = id;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.cantidad = cantidad;
        this.valor = valor;
    }
}
