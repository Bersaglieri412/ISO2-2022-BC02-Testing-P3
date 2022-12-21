package com.mycompany.cuentacorriente;

public class Ahorra_ahora_que_puedes extends CuentaCorriente{
    
    private static String mensaje = "Ahorra ahora que puedes";

    public Ahorra_ahora_que_puedes(double dinero) throws DineroNegativoException {
        super(dinero);
        System.out.println(mensaje);
    }
}
