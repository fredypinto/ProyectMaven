/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.co.vista;

import com.co.logica.Calculo;
import com.co.logica.Datos;
import javax.swing.JOptionPane;

/**
 *
 * @author fpintopi
 */
public class Main {

    public static void main(String[] args) {
        Datos datos;
        Calculo c = new Calculo();

        System.out.println("Ingrese datos");
        datos = new Datos(50, 0, 5);
        System.out.println("" + datos.getCantidaPersonas());
//        int valor = Integer.parseInt(JOptionPane.showInputDialog("Valor"));
//        int numPersona = Integer.parseInt(JOptionPane.showInputDialog("Valor"));

        c.calcularValorPorPersona(datos.getCantidaPersonas(), datos.getValorRecibo());
    }
}
