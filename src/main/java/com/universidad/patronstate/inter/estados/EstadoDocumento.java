/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.patronstate.inter.estados;

import com.universidad.patronstate.entidades.Documento;

/**
 *
 * @author AlvaroCardozo
 */
public abstract class EstadoDocumento {
    protected Documento documento;
    
    public abstract void publicar();
    public abstract void mostrarEstado();
}
