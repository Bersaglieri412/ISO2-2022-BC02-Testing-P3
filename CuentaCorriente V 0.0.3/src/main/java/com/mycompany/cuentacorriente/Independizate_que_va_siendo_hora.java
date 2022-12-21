package com.mycompany.cuentacorriente;

public class Independizate_que_va_siendo_hora extends CuentaCorriente{
    
    private static String mensaje = "Independízate que ya va siendo hora";

    public Independizate_que_va_siendo_hora(double dinero) throws DineroNegativoException {
        super(dinero);
        System.out.println(mensaje);
    }
}
