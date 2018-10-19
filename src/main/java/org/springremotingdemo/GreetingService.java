/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springremotingdemo;

/**
 *
 * @author Alan
 */
public interface GreetingService {

    public enum Menu {

        GREETING, VALEDICTION
    }

    Greeting greeting(String menuitem, String name);

    public String[] getMenu();
}

