package com.mycompany.cuentacorriente;

public class Cliente {
    
    private int edad;
    private boolean estudiando,vivePadres;

    public Cliente(int edad, boolean estudiando, boolean vivePadres) throws NewException {
        this.setEdad(edad);
        this.setEstudiando(estudiando);
        this.setVivePadres(vivePadres);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws NewException{
        if(edad < 0 || edad > 100){
            throw new NewException("Número no válido para la edad de una persona");
        } 
        this.edad = edad;
    }

    public boolean isEstudiando() {
        return estudiando;
    }

    public void setEstudiando(boolean estudiando) {
        this.estudiando = estudiando;
    }

    public boolean isVivePadres() {
        return vivePadres;
    }

    public void setVivePadres(boolean vivePadres) {
        this.vivePadres = vivePadres;
    }
}
