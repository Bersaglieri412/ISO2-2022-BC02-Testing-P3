package com.mycompany.cuentacorriente;

public class Saltando_del_nido extends CuentaCorriente{
    
    private final String mensaje = "Saltando del nido";

    public Saltando_del_nido(double dinero) throws NewException {
        super(dinero);
        System.out.println(mensaje);
    }
}
