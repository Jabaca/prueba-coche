/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probargit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Jabaca10
 */
public class cocheTest {
    
    public cocheTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of avanzar method, of class coche.
     */
    @Test
    public void testAvanzar() {
        System.out.println("avanzar");
        coche instance = new coche();
        instance.avanzar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of frenar method, of class coche.
     */
    @Test
    public void testFrenar() {
        System.out.println("frenar");
        coche instance = new coche();
        instance.frenar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encender method, of class coche.
     */
    @Test
    public void testEncender() {
        System.out.println("encender");
        coche instance = new coche();
        instance.encender();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of apagar method, of class coche.
     */
    @Test
    public void testApagar() {
        System.out.println("apagar");
        coche instance = new coche();
        instance.apagar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gasolina method, of class coche.
     */
    @Test
    public void testGasolina() {
        System.out.println("gasolina");
        coche instance = new coche();
        instance.gasolina();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
