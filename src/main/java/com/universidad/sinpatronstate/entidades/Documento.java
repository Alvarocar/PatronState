/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.sinpatronstate.entidades;

/**
 *
 * @author AlvaroCardozo
 */
public class Documento {
    
    private String estado;
    
    private String titulo;
    
    public Documento( String titulo ) {
        setTitulo(titulo);
        setEstado("Borrador");
    }
    
    public void setEstado(String estado ){
        this.estado = estado;
    }
    
    public void mostrarEstado(){
        System.out.println("El estado actual del documento \""
                + this.titulo + "\" es \"" + this.estado + "\"");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void Publicar(){
        switch(this.estado){
            case "Borrador":
                setEstado("Moderacion");
            break;
            case "Moderacion":
                setEstado("Publicado");
            break;
            case "Publicado":
                System.out.println("El documento ya esta publicado");
            break;
            default:
                System.out.println("El estado actual del documento "
                        + "no ha sido encontrado");
            break;
        }
    }
}
