/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.patronstate.entidades;

import com.universidad.patronstate.impl.estados.BorradorEstado;
import com.universidad.patronstate.inter.estados.EstadoDocumento;

/**
 *
 * @author AlvaroCardozo
 */
public class Documento {
    private EstadoDocumento estado;
    
    private String titulo;
    
    public Documento( String titulo ) {
        this.titulo = titulo;
        this.estado = new BorradorEstado(this);
    }
    
    public void setEstado(EstadoDocumento estado ){
        this.estado = estado;
    }
    
    public void mostrarEstado(){
        estado.mostrarEstado();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void Publicar(){
        estado.publicar();
    }
    
}
