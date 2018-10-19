/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springremotingdemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alan
 */
public class GreetingServiceImplTest {

    public GreetingServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of greeting method, of class GreetingServiceImpl.
     */
    @Test
    public void testGreeting() {
        System.out.println("greeting");
        String name = "Alan";
        GreetingServiceImpl instance = new GreetingServiceImpl();
        String expResult = "Goodbye, Alan!";
        Greeting result = instance.greeting("VALEDICTION", name);
        assertEquals(expResult, result.getContent());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    @Test
    public void testGetMenu() {
        System.out.println("getMenu");
        GreetingServiceImpl instance = new GreetingServiceImpl();
        String[] result = instance.getMenu();
        assertEquals("GREETING", result[0]);
        assertEquals("VALEDICTION", result[1]);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
