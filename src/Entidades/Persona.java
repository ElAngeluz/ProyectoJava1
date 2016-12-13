/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Johanna Parrales
 */
public class Persona implements Serializable{
    private String id;
    private String nombres;
    private String apellidos;
    private String nacionalidad;
    private String genero;
    private Date fNacimiento;
    private String direccion;
    private String estadoCivil;
    private String profesion;
    private String trabaja;
    private String sueldo;

        //Constructor de Clase PERSONA
    public Persona(String id, String nombres, String apellidos, String nacionalidad, String genero, Date edad, String direccion,
            String civil, String profesion,String trabaja, String sueldo){
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nacionalidad = nacionalidad;
        this.genero = genero;
        fNacimiento = edad;
        this.direccion = direccion;
        this.estadoCivil = civil;
        this.profesion = profesion;
        this.trabaja = trabaja;
        this.sueldo = sueldo;
    }
    
    public Persona(){
        
    }
    
        public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(String trabaja) {
        this.trabaja = trabaja;
    }

    public String getSueldo() {
        return sueldo;
    }

    public void setSueldo(String sueldo) {
        this.sueldo = sueldo;
    }

    public Date getfNacimiento() {
        return fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    //Metodos GETTERS y SETTERS de la Clase PERSONA
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
} //Fin de la clase Persona