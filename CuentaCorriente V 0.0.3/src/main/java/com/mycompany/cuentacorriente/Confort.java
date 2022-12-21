package com.mycompany.cuentacorriente;

public class Confort extends CuentaCorriente {
    
    private static String mensaje = "Disfruta del Confort";

    public Confort(double dinero) throws DineroNegativoException {
        super(dinero);
        System.out.println(mensaje);
    }
}
