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
public class ModeracionEstado extends EstadoDocumento{
    
    public ModeracionEstado(Documento documento){
        this.documento = documento;
    }
    
    @Override
    public void publicar() {
        this.documento.setEstado(new PublicadoEstado(this.documento));
    }
    
    @Override
    public void mostrarEstado(){
        System.out.println("Actualmente el documento \"" 
                + this.documento.getTitulo() + "\" esta en revision");
    }
    
}
