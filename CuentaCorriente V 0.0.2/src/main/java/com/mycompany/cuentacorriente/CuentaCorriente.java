package com.mycompany.cuentacorriente;

public class CuentaCorriente {
    private double dinero;

    public CuentaCorriente(double dinero) throws DineroNegativoException{
        this.ingresarDinero(dinero);
    }

    public double getDinero() {
        return dinero;
    }

    public void ingresarDinero(double dinero) throws DineroNegativoException{
        if(dinero < 0){
            throw new DineroNegativoException("No se puede ingresar a una cuenta dinero negativo");
        }
        this.dinero += dinero;
    }
}
