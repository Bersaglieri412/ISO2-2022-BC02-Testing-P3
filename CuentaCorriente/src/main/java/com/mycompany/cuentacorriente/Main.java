package com.mycompany.cuentacorriente;

import java.util.ArrayList;

public class Main {
    
    public static void main(String [] args) {
        ArrayList<CuentaCorriente> cuentas = new ArrayList<>();
        try {
            Cliente c = new Cliente(128,false,false);
            CuentaCorriente cuenta = establecerCuenta(c);
            cuentas.add(cuenta);
        } catch (DineroNegativoException | EdadFueraRangoException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(cuentas.toString());
    }
    
    public static CuentaCorriente establecerCuenta(Cliente c) throws DineroNegativoException{
        CuentaCorriente cuenta = null;
        if(c.getEdad() < 18 && c.isVivePadres() && c.isEstudiando()){
            cuenta = new Confort(0);
        }else if(c.getEdad() < 25 && c.isEstudiando() && !c.isVivePadres()){
            cuenta = new Vamos_que_tu_puedes(0);
        }else if((c.getEdad() >= 18 && c.getEdad() <= 25) && !c.isEstudiando() && c.isVivePadres()){
            cuenta = new Ahorra_ahora_que_puedes(0);
        }else if((c.getEdad() >= 18 && c.getEdad() <= 25) && !c.isEstudiando() && !c.isVivePadres()){
            cuenta = new Saltando_del_nido(0);
        }else if(c.getEdad() > 25 && !c.isEstudiando() && c.isVivePadres()){
            cuenta = new Independizate_que_va_siendo_hora(0);
        }else if(c.getEdad() > 25 && !c.isEstudiando() && !c.isVivePadres()){
            cuenta = new Bienvenido_a_la_vida_adulta(0);
        }
        return cuenta;
    }
}
