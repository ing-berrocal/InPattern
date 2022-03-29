/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.inpatterns.creation.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author DELL
 */
public class Cita {
    
    private LocalDateTime fechaCreacion;
    private LocalDate fechaInicio;
    private LocalDate fechaFinal;
    private String ciudad;
    private String nombres;
    private String apellidos;
    private String area;    
    private String telefono;
    private String direccion;
    private String url;
    private String nombreFuncionario;
    
    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

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

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombreFuncionario(String nombreFuncionario) {
        this.nombreFuncionario = nombreFuncionario;
    }

    public String getNombreFuncionario() {
        return nombreFuncionario;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }        

    private Cita(Builder buider) {
        this.fechaCreacion = buider.fechaCreacion;
        this.fechaInicio = buider.fechaInicio;
        this.fechaFinal = buider.fechaFinal;
        this.ciudad = buider.ciudad;
        this.nombres = buider.nombres;
        this.apellidos = buider.apellidos;
        this.area = buider.area;
        this.telefono = buider.telefono;
        this.direccion = buider.direccion;
        this.url = buider.url;
        this.nombreFuncionario = buider.nombreFuncionario;
    }
    
    
    public static final class Builder{
        private LocalDateTime fechaCreacion;
        private LocalDate fechaInicio;
        private LocalDate fechaFinal;
        private String ciudad;
        private String nombres;
        private String apellidos;
        private String area;    
        private String telefono;
        private String direccion;
        private String url;
        private String nombreFuncionario;        

        public Builder setFechas(LocalDate fechaInicio,LocalDate fechaFinal) {
            this.fechaInicio = fechaInicio;
            this.fechaFinal = fechaFinal;
            return this;
        }        

        public Builder setCiudad(String ciudad) {
            this.ciudad = ciudad;
            return this;
        }

        public Builder setNombres(String nombres) {
            this.nombres = nombres;
            return this;
        }

        public Builder setApellidos(String apellidos) {
            this.apellidos = apellidos;
            return this;
        }

        public Builder setArea(String area) {
            this.area = area;
            return this;
        }

        public Builder setTelefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public Builder setDireccion(String direccion) {
            this.direccion = direccion;
            return this;
        }

        public Builder setUrl(String url) {
            this.url = url;
            return this;
        }

        public Builder setNombreFuncionario(String nombreFuncionario) {
            this.nombreFuncionario = nombreFuncionario;
            return this;
        }               
        
        public Cita build(){
            return new com.proyecto.inpatterns.creation.builder.Cita(this);
        }
    }        
}
