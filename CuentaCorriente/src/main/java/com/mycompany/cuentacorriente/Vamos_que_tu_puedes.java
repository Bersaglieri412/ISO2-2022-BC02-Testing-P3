package com.mycompany.cuentacorriente;

public class Vamos_que_tu_puedes extends CuentaCorriente{
    
    private final String mensaje = "Vamos que tu puedes";

    public Vamos_que_tu_puedes(double dinero) throws NewException {
        super(dinero);
        System.out.println(mensaje);
    }
    
    
}
