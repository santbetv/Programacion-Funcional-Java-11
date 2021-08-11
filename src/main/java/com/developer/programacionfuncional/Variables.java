/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.developer.programacionfuncional;

/**
 *
 * @author rizzoli
 */
public class Variables {

    public void repetir(String texto, int Cantidad) {
        var reptido = texto.repeat(Cantidad);
        System.out.println(reptido);
    }

    public static void main(String[] args) {

        Variables variables = new Variables();
        variables.repetir("Hola", 3);

    }

}
