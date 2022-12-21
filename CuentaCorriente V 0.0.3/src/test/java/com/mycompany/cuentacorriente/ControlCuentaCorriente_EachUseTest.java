package com.mycompany.cuentacorriente;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlCuentaCorriente_EachUseTest {
    
    static ControlCuentaCorriente instance;
    
    public ControlCuentaCorriente_EachUseTest() {
        instance = new ControlCuentaCorriente();
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
     * Test of getCuentas method, of class ControlCuentaCorriente.
     */
    @Test
    public void testGetCuentas() {
        ControlCuentaCorriente instan = new ControlCuentaCorriente();
        boolean expResult = true;
        ArrayList<CuentaCorriente> result = instan.getCuentas();
        assertEquals(expResult, result.isEmpty());
    }
    
    /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta() {
        Cliente c = null;
        try{
            assert(instance.establecerCuenta(new Cliente(5,true,true)) instanceof Confort);
            assert(instance.establecerCuenta(new Cliente(21,false,false)) instanceof Saltando_del_nido);
            assert(instance.establecerCuenta(new Cliente(27,true,false)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(17,false,true)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(18,false,false)) instanceof Saltando_del_nido);
            assert(instance.establecerCuenta(new Cliente(25,false,false)) instanceof Saltando_del_nido);
            assert(instance.establecerCuenta(new Cliente(26,false,true)) instanceof Independizate_que_va_siendo_hora);
            assert(instance.establecerCuenta(new Cliente(24,false,true)) instanceof Ahorra_ahora_que_puedes);
        }catch(EdadFueraRangoException | DineroNegativoException ex){
            fail();
        }
    }

    /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta1() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(-2,true,false));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta2() throws DineroNegativoException {
        try{
           instance.establecerCuenta(new Cliente(-1,false,false));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta3() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(0,true,false));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta4() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(300000000,true,true));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta5() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(-300000000,true,false));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
}
