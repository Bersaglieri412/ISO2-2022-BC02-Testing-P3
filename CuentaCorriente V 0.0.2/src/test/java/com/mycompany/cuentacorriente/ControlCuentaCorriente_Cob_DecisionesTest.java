package com.mycompany.cuentacorriente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlCuentaCorriente_Cob_DecisionesTest {
    
    static ControlCuentaCorriente c = new ControlCuentaCorriente();
    
    public ControlCuentaCorriente_Cob_DecisionesTest() {
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

    @Test
    public void testCoberturaDecisiones() throws DineroNegativoException{
        try {
            assert(c.establecerCuenta(new Cliente(17, true, true)) instanceof Confort);
            assert(c.establecerCuenta(new Cliente(20, true, false)) instanceof Vamos_que_tu_puedes);
            assert(c.establecerCuenta(new Cliente(18, false, true)) instanceof Ahorra_ahora_que_puedes);
            assert(c.establecerCuenta(new Cliente(18, false, false)) instanceof Saltando_del_nido);
            assert(c.establecerCuenta(new Cliente(26, false, true)) instanceof Independizate_que_va_siendo_hora);
            assert(c.establecerCuenta(new Cliente(26, false, false)) instanceof Bienvenido_a_la_vida_adulta);
            assert(c.establecerCuenta(new Cliente(26, true, true)) instanceof Cuenta_por_defecto);
        } catch (EdadFueraRangoException ex) {
            fail();
        }
    }  
}
