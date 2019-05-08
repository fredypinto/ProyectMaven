/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.control;

/**
 *
 * @author fpintopi
 */
public class Datos {

    private int cantidaPersonas;
    private int cantidadAptos;
    private int valorRecibo;
    
    public Datos(){}

    public Datos(int cantidadPersonas, int cantidadAptos, int valorRecibo) {
        this.cantidaPersonas = cantidadPersonas;
        this.cantidadAptos = cantidadAptos;
        this.valorRecibo = valorRecibo;

    }

    public int getCantidaPersonas() {
        return cantidaPersonas;
    }

    public void setCantidaPersonas(int cantidaPersonas) {
        this.cantidaPersonas = cantidaPersonas;
    }

    public int getCantidadAptos() {
        return cantidadAptos;
    }

    public void setCantidadAptos(int cantidadAptos) {
        this.cantidadAptos = cantidadAptos;
    }

    public int getValorRecibo() {
        return valorRecibo;
    }

    public void setValorRecibo(int valorRecibo) {
        this.valorRecibo = valorRecibo;
    }

    @Override
    public String toString() {
        return "Datos{" + "cantidaPersonas=" + cantidaPersonas + ", cantidadAptos=" + cantidadAptos + ", valorRecibo=" + valorRecibo + '}';
    }
}
