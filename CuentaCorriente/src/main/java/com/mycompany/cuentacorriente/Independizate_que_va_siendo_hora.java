package com.mycompany.cuentacorriente;

public class Independizate_que_va_siendo_hora extends CuentaCorriente{
    
    private final String mensaje = "Independízate que ya va siendo hora";

    public Independizate_que_va_siendo_hora(double dinero) throws NewException {
        super(dinero);
        System.out.println(mensaje);
    }
}
