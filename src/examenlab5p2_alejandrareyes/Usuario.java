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
public class Usuario {
    protected String nombre, apellido, contrasenia, sexo, departamento,numeroidentidad;
    protected Date fechanacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contrasenia, String sexo, String departamento, String numeroidentidad, Date fechanacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.sexo = sexo;
        this.departamento = departamento;
        this.numeroidentidad = numeroidentidad;
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getNumeroidentidad() {
        return numeroidentidad;
    }

    public void setNumeroidentidad(String numeroidentidad) {
        this.numeroidentidad = numeroidentidad;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", contrasenia=" + contrasenia + ", sexo=" + sexo + ", departamento=" + departamento + ", numeroidentidad=" + numeroidentidad + ", fechanacimiento=" + fechanacimiento + '}';
    }
    
    
    
    
    
    
    
    
           
    
}
