package com.mycompany.cuentacorriente;

public class Saltando_del_nido extends CuentaCorriente{
    
    private static String mensaje = "Saltando del nido";

    public Saltando_del_nido(double dinero) throws DineroNegativoException {
        super(dinero);
        System.out.println(mensaje);
    }
}
