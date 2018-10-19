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
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

/**
 *
 * @author Alan
 */
public class ApplicationTest {
    
    public ApplicationTest() {
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
     * Test of greetingServiceImpl method, of class Application.
     */
    @Test
    public void testGreetingServiceImpl() {
        System.out.println("greetingServiceImpl");
        Application instance = new Application();
        GreetingServiceImpl expResult = null;
        GreetingServiceImpl result = instance.greetingServiceImpl();
        assertNotEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of greetingExporter method, of class Application.
     */
    @Test
    public void testGreetingExporter() {
        System.out.println("greetingExporter");
        Application instance = new Application();
        HttpInvokerServiceExporter expResult = null;
        HttpInvokerServiceExporter result = instance.greetingExporter();
        assertNotEquals(expResult, result);
    }

}
