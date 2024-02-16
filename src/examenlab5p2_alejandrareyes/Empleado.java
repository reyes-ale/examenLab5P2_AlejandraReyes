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
public class Empleado extends Usuario{
    protected String carrera, puestolaboral;
    protected int anios_enRNP;

    public Empleado() {
    }

    public Empleado(String carrera, String puestolaboral, int anios_enRNP, String nombre, String apellido, String contrasenia, String sexo, String departamento, Date fechanacimiento) {
        super(nombre, apellido, contrasenia, sexo, departamento, fechanacimiento);
        this.carrera = carrera;
        this.puestolaboral = puestolaboral;
        this.anios_enRNP = anios_enRNP;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getPuestolaboral() {
        return puestolaboral;
    }

    public void setPuestolaboral(String puestolaboral) {
        this.puestolaboral = puestolaboral;
    }

    public int getAnios_enRNP() {
        return anios_enRNP;
    }

    public void setAnios_enRNP(int anios_enRNP) {
        this.anios_enRNP = anios_enRNP;
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
        return "Empleado{" + super.toString() +"carrera=" + carrera + ", puestolaboral=" + puestolaboral + ", anios_enRNP=" + anios_enRNP + '}';
    }
    
    
    
}
