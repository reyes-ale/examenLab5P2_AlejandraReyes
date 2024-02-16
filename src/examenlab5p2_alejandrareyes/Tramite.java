/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_alejandrareyes;

import java.util.Date;

/**
 *
 * @author aleja
 */
public class Tramite {
    protected String nombre, descripcion, num_identidad;
    protected Date fecha_envio;

    public Tramite() {
    }

    public Tramite(String nombre, String descripcion, String num_identidad, Date fecha_envio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.num_identidad = num_identidad;
        this.fecha_envio = fecha_envio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNum_identidad() {
        return num_identidad;
    }

    public void setNum_identidad(String num_identidad) {
        this.num_identidad = num_identidad;
    }

    public Date getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(Date fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    @Override
    public String toString() {
        return "Tramite{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", num_identidad=" + num_identidad + ", fecha_envio=" + fecha_envio + '}';
    }
    
    
    
    
}
