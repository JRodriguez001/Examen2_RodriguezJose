package examen2_rodriguezjose;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author david
 */
public class Productos {
    int id;
    int cantidad;
    String nombre;
    double precio;
    boolean estado;
    public Productos(int id, int cantidad, String nombre, double precio, boolean estado) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.precio = precio;
        this.estado = estado;
    }

    

    public double getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        if (estado==true) {
            System.out.println("Disponible");
        }else{
            System.out.println("Agotado");
        }
        return estado;
    }

    public void setEstado(boolean estado) {
        if (estado==true) {
            System.out.println("Disponible");
        }else{
            System.out.println("Agotado");
        }
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Productos{" + "id=" + id + ", cantidad=" + cantidad + ", nombre=" + nombre + ", precio=" + precio + ", estado=" + estado + '}';
    }

    
    
    

    
    
    
    
}

