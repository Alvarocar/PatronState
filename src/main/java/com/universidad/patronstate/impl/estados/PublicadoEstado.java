/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.patronstate.impl.estados;

import com.universidad.patronstate.entidades.Documento;
import com.universidad.patronstate.inter.estados.EstadoDocumento;

/**
 *
 * @author AlvaroCardozo
 */
public class PublicadoEstado extends EstadoDocumento{
    
    public PublicadoEstado(Documento documento){
        this.documento = documento;
    }

    @Override
    public void publicar() {
        System.out.println("El documento ya esta publicado");
    }

    @Override
    public void mostrarEstado() {
        System.out.println("El documento \""
                + this.documento.getTitulo() + "\" ya esta publicado");
    }
}
