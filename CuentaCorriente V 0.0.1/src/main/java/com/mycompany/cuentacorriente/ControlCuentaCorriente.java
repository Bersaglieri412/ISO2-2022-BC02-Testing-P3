package com.mycompany.cuentacorriente;

import java.util.ArrayList;

public final class ControlCuentaCorriente {
    private ArrayList<CuentaCorriente> cuentas;

    public ControlCuentaCorriente() {
        cuentas = new ArrayList<>();
    }

    public ArrayList<CuentaCorriente> getCuentas() {
        return cuentas;
    }
    
    public CuentaCorriente establecerCuenta(Cliente c) throws DineroNegativoException{
        CuentaCorriente cuenta = null;
        if(c.getEdad() < 18 && c.isEstudiando() && c.isVivePadres()){
            cuenta = new Confort(0);
        }else if((c.getEdad() >= 18 && c.getEdad() < 25) &&  c.isEstudiando() && !c.isVivePadres()){
            cuenta = new Vamos_que_tu_puedes(0);
        }else if((c.getEdad() >= 18 && c.getEdad() <= 25) && !c.isEstudiando() && c.isVivePadres() ){
            cuenta = new Ahorra_ahora_que_puedes(0);
        }else if((c.getEdad() >= 18 && c.getEdad() <= 25) && !c.isEstudiando() && !c.isVivePadres()){
            cuenta = new Saltando_del_nido(0);
        }else if(c.getEdad() > 25 && !c.isEstudiando() && c.isVivePadres()){
            cuenta = new Independizate_que_va_siendo_hora(0);
        }else if(c.getEdad() > 25 && !c.isEstudiando() && !c.isVivePadres()){
            cuenta = new Bienvenido_a_la_vida_adulta(0);
        }else{
            cuenta = new Cuenta_por_defecto(0);
        }
        cuentas.add(cuenta);
        return cuenta;
    }
}
