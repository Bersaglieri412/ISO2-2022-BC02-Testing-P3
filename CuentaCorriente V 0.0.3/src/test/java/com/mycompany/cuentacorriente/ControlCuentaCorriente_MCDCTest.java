package com.mycompany.cuentacorriente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlCuentaCorriente_MCDCTest {
    
    static ControlCuentaCorriente c = new ControlCuentaCorriente();
    
    public ControlCuentaCorriente_MCDCTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuentaMCDC() throws DineroNegativoException {
        try{
            /* Variables A,B,C TRUE*/
            assert(c.establecerCuenta(new Cliente(15, true, true)) instanceof Confort);
            assert(c.establecerCuenta(new Cliente(22, true, false)) instanceof Vamos_que_tu_puedes);
            assert(c.establecerCuenta(new Cliente(21, false, true)) instanceof Ahorra_ahora_que_puedes);
            assert(c.establecerCuenta(new Cliente(20, false, false)) instanceof Saltando_del_nido);
            assert(c.establecerCuenta(new Cliente(27, false, true)) instanceof Independizate_que_va_siendo_hora);
            assert(c.establecerCuenta(new Cliente(56, false, false)) instanceof Bienvenido_a_la_vida_adulta);
            /* Variable A (edad) FALSE*/
            assert(!(c.establecerCuenta(new Cliente(20, true, true)) instanceof Confort));
            assert(!(c.establecerCuenta(new Cliente(56, true, false)) instanceof Vamos_que_tu_puedes));
            assert(!(c.establecerCuenta(new Cliente(55, false, true)) instanceof Ahorra_ahora_que_puedes));
            assert(!(c.establecerCuenta(new Cliente(61, false, false)) instanceof Saltando_del_nido));
            assert(!(c.establecerCuenta(new Cliente(14, false, true)) instanceof Independizate_que_va_siendo_hora));
            assert(!(c.establecerCuenta(new Cliente(17, false, false)) instanceof Bienvenido_a_la_vida_adulta));
            /* Variable B (estudiando) FALSE*/
            assert(!(c.establecerCuenta(new Cliente(17, false, true)) instanceof Confort));
            assert(!(c.establecerCuenta(new Cliente(20, false, false)) instanceof Vamos_que_tu_puedes));
            assert(!(c.establecerCuenta(new Cliente(18, true, true)) instanceof Ahorra_ahora_que_puedes));
            assert(!(c.establecerCuenta(new Cliente(18, true, false)) instanceof Saltando_del_nido));
            assert(!(c.establecerCuenta(new Cliente(26, true, true)) instanceof Independizate_que_va_siendo_hora));
            assert(!(c.establecerCuenta(new Cliente(26, true, false)) instanceof Bienvenido_a_la_vida_adulta));
            /* Variable C (vivePadres) FALSE*/
            assert(!(c.establecerCuenta(new Cliente(17, true, false)) instanceof Confort));
            assert(!(c.establecerCuenta(new Cliente(20, true, true)) instanceof Vamos_que_tu_puedes));
            assert(!(c.establecerCuenta(new Cliente(18, false, false)) instanceof Ahorra_ahora_que_puedes));
            assert(!(c.establecerCuenta(new Cliente(18, false, true)) instanceof Saltando_del_nido));
            assert(!(c.establecerCuenta(new Cliente(26, false, false)) instanceof Independizate_que_va_siendo_hora));
            assert(!(c.establecerCuenta(new Cliente(26, false, true)) instanceof Bienvenido_a_la_vida_adulta));
        }catch(EdadFueraRangoException ex){
            fail();
        }
    }
}
