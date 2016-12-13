/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;

/**
 *
 * @author Johanna Parrales
 */
public class Sensor implements Serializable{
    private String id;
    private String nombre;
    private String fabricante;
    private String modelo;
    private String ubicacion;
    private float valorActual;
    private String tipo;
    private float valorAlarma;
    private String descripcion;
    private int estado;
    
    //Constructor de Clase SENSOR
    public Sensor(String id, String nombre, String fabricante, String modelo, 
            String ubicacion, float valorActual, String tipo, float valorAlarma, String descripcion, int estado) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ubicacion = ubicacion;
        this.valorActual = valorActual;
        this.tipo = tipo;
        this.valorAlarma = valorAlarma;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public Sensor() {
        
    }
    
    //Metodos GETTERS y SETTERS de la Clase SENSOR
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public float getValorActual() {
        return valorActual;
    }

    public void setValorActual(float valorActual) {
        this.valorActual = valorActual;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValorAlarma() {
        return valorAlarma;
    }

    public void setValorAlarma(float valorAlarma) {
        this.valorAlarma = valorAlarma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }
    
    public void imprimirInfoSensor(){
        System.out.println("███████████████████");
        System.out.println("███████████████████");
        System.out.println("     INFORMACION SENSOR");
        System.out.println("██ ID: "+id);
        System.out.println("██ Nombre: "+nombre);
        System.out.println("██ Fabricante: "+fabricante);
        System.out.println("██ Modelo: "+modelo);
        System.out.println("██ Ubicacion: "+ubicacion);
        System.out.println("██ Valor Actual: "+valorActual);
        System.out.println("██ Tipo: "+tipo);
        System.out.println("██ Valor Alarma: "+valorAlarma);
        System.out.println("██ Estado: "+estado);
        System.out.println("\n███████████████████");
        System.out.println("███████████████████\n");
    }
} //Fin de la clase Sensor
