package com.mycompany.cuentacorriente;

public class CuentaCorriente {
    private double dinero;

    public CuentaCorriente(double dinero) throws NewException{
        this.setDinero(dinero);
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) throws NewException{
        if(dinero < 0){
            throw new NewException("No se puede crear una cuenta con dinero negativo");
        }
        this.dinero = dinero;
    }
}
