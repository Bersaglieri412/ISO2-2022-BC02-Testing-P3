package com.mycompany.cuentacorriente;

public class DineroNegativoException extends Exception{

    public DineroNegativoException(String message) {
        super(message);
    }
}
