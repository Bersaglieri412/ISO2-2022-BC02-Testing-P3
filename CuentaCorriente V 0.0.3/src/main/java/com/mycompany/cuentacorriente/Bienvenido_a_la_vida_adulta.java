package com.mycompany.cuentacorriente;

public class Bienvenido_a_la_vida_adulta extends CuentaCorriente{
    
    private static String mensaje = "Bienvenido a la vida Adulta";

    public Bienvenido_a_la_vida_adulta(double dinero) throws DineroNegativoException {
        super(dinero);
        System.out.println(mensaje);
    }
}
