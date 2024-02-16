/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenlab5p2_alejandrareyes;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author aleja
 */
public class Usuario {
    Random rand = new Random();
    protected String nombre, apellido, contrasenia, sexo, departamento,numeroidentidad;
    protected Date fechanacimiento;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String contrasenia, String sexo, String departamento, Date fechanacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenia = contrasenia;
        this.sexo = sexo;
        this.departamento = departamento;
        this.numeroidentidad = numerodeidentidad(departamento);
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
    
    public String numerodeidentidad(String departamento){
        int random; 
        String numid ="";
        if (departamento.equalsIgnoreCase("Francisco Morazan")){//1-28
            numid+="01";
            random = rand.nextInt(28)+1;
            numid+=random;
            
        } else if (departamento.equalsIgnoreCase("Cortes")){//1-12
            numid+="02";
            random = rand.nextInt(12)+1;
            numid+=random;
            
        } else if (departamento.equalsIgnoreCase("Comayagua")){//1-21
            numid+="03";
            random = rand.nextInt(21)+1;
            numid+=random;
        }
        //0801-2001-12344
        int anio = fechanacimiento.getYear();
        numid+=anio;
        
        for (int i = 0; i < 4; i++) {
            random=rand.nextInt(9)+1;
            numid+=random;
        }
       
        return numid;
    }
    
    
    
    
    
    
    
    
           
    
}
