package com.mycompany.cuentacorriente;

public class Cuenta_por_defecto extends CuentaCorriente{
    
    private static String mensaje = "Creada cuenta por defecto";

    public Cuenta_por_defecto(double dinero) throws DineroNegativoException {
        super(dinero);
        System.out.println(mensaje);
    }  
}
