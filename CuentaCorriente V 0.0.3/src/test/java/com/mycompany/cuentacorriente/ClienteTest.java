package com.mycompany.cuentacorriente;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteTest {
    
    static Cliente c;
    
    public ClienteTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws EdadFueraRangoException {
        c = new Cliente(20,true,false);
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
     * Test of Cliente constructor.
     */
    @Test
    public void testCliente(){
        Cliente cliente = null;
        try{
            cliente = new Cliente(120,true,true);
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }

    /**
     * Test of getEdad method, of class Cliente.
     */
    @Test
    public void testGetEdad() {
        Cliente instance = c;
        int expResult = 20;
        int result = instance.getEdad();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEdad method, of class Cliente.
     */
    @Test
    public void testSetEdad() throws EdadFueraRangoException {
        int edad = 1;
        Cliente instance = c;
        instance.setEdad(edad);
    }
    
    /**
     * Test of setEdad method, of class Cliente.
     */
    @Test
    public void testSetEdad1(){
        int edad = 120;
        Cliente instance = c;
        try{
            instance.setEdad(edad);
        }catch(EdadFueraRangoException ex){
            assert(true);
        }
    }

    /**
     * Test of isEstudiando method, of class Cliente.
     */
    @Test
    public void testIsEstudiando() {
        Cliente instance = c;
        boolean expResult = true;
        boolean result = instance.isEstudiando();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEstudiando method, of class Cliente.
     */
    @Test
    public void testSetEstudiando() {
        boolean estudiando = false;
        Cliente instance = c;
        instance.setEstudiando(estudiando);
    }

    /**
     * Test of isVivePadres method, of class Cliente.
     */
    @Test
    public void testIsVivePadres() {
        Cliente instance = c;
        boolean expResult = false;
        boolean result = instance.isVivePadres();
        assertEquals(expResult, result);
    }

    /**
     * Test of setVivePadres method, of class Cliente.
     */
    @Test
    public void testSetVivePadres() {
        boolean vivePadres = false;
        Cliente instance = c;
        instance.setVivePadres(vivePadres);
    }
    
}
