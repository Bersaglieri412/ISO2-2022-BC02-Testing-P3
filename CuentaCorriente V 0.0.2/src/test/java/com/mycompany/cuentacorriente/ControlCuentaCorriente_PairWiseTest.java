package com.mycompany.cuentacorriente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ControlCuentaCorriente_PairWiseTest {
    
    static ControlCuentaCorriente instance;
    
    public ControlCuentaCorriente_PairWiseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        instance = new ControlCuentaCorriente();
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
    public void testEstablecerCuenta() {
        try{
            assert(instance.establecerCuenta(new Cliente(5,true,false)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(5,false,true)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(21,true,false)) instanceof Vamos_que_tu_puedes);
            assert(instance.establecerCuenta(new Cliente(21,false,true)) instanceof Ahorra_ahora_que_puedes);
            assert(instance.establecerCuenta(new Cliente(27,false,false)) instanceof Bienvenido_a_la_vida_adulta);
            assert(instance.establecerCuenta(new Cliente(27,true,true)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(17,true,true)) instanceof Confort);
            assert(instance.establecerCuenta(new Cliente(17,false,false)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(18,true,false)) instanceof Vamos_que_tu_puedes);
            assert(instance.establecerCuenta(new Cliente(18,false,true)) instanceof Ahorra_ahora_que_puedes);
            assert(instance.establecerCuenta(new Cliente(25,true,false)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(25,false,true)) instanceof Ahorra_ahora_que_puedes);
            assert(instance.establecerCuenta(new Cliente(26,false,false)) instanceof Bienvenido_a_la_vida_adulta);
            assert(instance.establecerCuenta(new Cliente(26,true,true)) instanceof Cuenta_por_defecto);
            assert(instance.establecerCuenta(new Cliente(24,false,false)) instanceof Saltando_del_nido);
            assert(instance.establecerCuenta(new Cliente(24,true,true)) instanceof Cuenta_por_defecto);
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
            instance.establecerCuenta(new Cliente(-2,true,true));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta2() throws DineroNegativoException  {
        try{
            instance.establecerCuenta(new Cliente(-2,false,false));
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
            instance.establecerCuenta(new Cliente(-1,true,false));
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
            instance.establecerCuenta(new Cliente(-1,false,true));
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
            instance.establecerCuenta(new Cliente(0,true,true));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta6() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(0,false,false));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta7() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(300000000,true,false));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta8() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(300000000,false,true));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta9() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(-300000000,true,true));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
    
     /**
     * Test of establecerCuenta method, of class ControlCuentaCorriente.
     */
    @Test
    public void testEstablecerCuenta10() throws DineroNegativoException {
        try{
            instance.establecerCuenta(new Cliente(-300000000,false,false));
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }
}
