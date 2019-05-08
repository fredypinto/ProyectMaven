/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.logica;

import com.co.control.Datos;

/**
 *
 * @author fpintopi
 */
public class Calculo {

    Datos d = new Datos();
    int Resultado = 0;

    public void calcularValorPorPersona() {
         //Resultado = d.getValorRecibo() / d.getCantidaPersonas();
         
         System.out.println("Metodo"+d.getCantidaPersonas());
    }
}
