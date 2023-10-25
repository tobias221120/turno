package com.uni.turno.dto;

import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class TurnoDTO {
    private String nombre;
    private int edad;
    private String apellido;
    private String documento;
    private LocalDate fecha;
    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }




    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }




    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }



    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}