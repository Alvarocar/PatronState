/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.universidad.patronstate;

import com.universidad.patronstate.entidades.Documento;

/**
 *
 * @author AlvaroCardozo
 */
public class Main {
    public static void main(String[] args) {
        Documento miDocumento1 = new Documento(
                "La importancia de los Patrones de Diseño");
        
        Documento miDocumento2 = new Documento("uso de el patron State");
        
        
        
        miDocumento1.mostrarEstado();
        
        miDocumento2.mostrarEstado();
        
        miDocumento1.Publicar();
        
        miDocumento1.mostrarEstado();
        
        miDocumento2.Publicar();
        
        miDocumento2.mostrarEstado();
        
        miDocumento1.Publicar();
        
        miDocumento1.mostrarEstado();
        
        miDocumento1.Publicar();
        
        miDocumento1.mostrarEstado();
    }
}
