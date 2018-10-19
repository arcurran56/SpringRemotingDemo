/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springremotingdemo;

/**
 *
 * @author Alan
 */
public class GreetingClient {
    GreetingService GreetingService;

    public void setGreetingService(GreetingService GreetingService) {
        this.GreetingService = GreetingService;
    }

    public GreetingService getGreetingService() {
        return GreetingService;
    }
    public Greeting getGreeting(String menuitem, String name){
        return GreetingService.greeting(menuitem, name);
    }
    public String[] getMenu(){
        return GreetingService.getMenu();
    }
}
