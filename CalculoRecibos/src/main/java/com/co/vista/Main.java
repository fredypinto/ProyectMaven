/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.vista;

import com.co.logica.Calculo;
import com.co.control.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author fpintopi
 */
public class Main {

    public static void main(String[] args) {
        Calculo c = new Calculo();

        System.out.println("Ingrese datos");
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
        int numPersona = Integer.parseInt(JOptionPane.showInputDialog("Valor"));

        Datos datos = new Datos();
        datos.setCantidaPersonas(numPersona);
        datos.setValorRecibo(valor);

        c.calcularValorPorPersona();
    }
}
