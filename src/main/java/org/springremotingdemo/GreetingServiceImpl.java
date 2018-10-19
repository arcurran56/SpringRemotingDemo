/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alan
 */
package org.springremotingdemo;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class GreetingServiceImpl implements GreetingService {

    private static final String helloTemplate = "Hello, %s!";
    private static final String goodbyeTemplate = "Goodbye, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Override
    public Greeting greeting(String menuitemstring, String name) {
        Menu menuitem = Menu.valueOf(menuitemstring);
        Greeting g = null;
        switch (menuitem) {
        
    

            case GREETING:  g = new Greeting(counter.incrementAndGet(),
                            String.format(helloTemplate, name));
                break;
            case VALEDICTION:   g = new Greeting(counter.incrementAndGet(),
                            String.format(goodbyeTemplate, name));
                break;
        }
        return g;
    }

    @Override
    public String[] getMenu() {
        Menu[] raw = Menu.values();
        String[] result = new String[Menu.values().length];
        int i = 0;
        for (Menu item: raw){
            result[i] = item.toString();
            i++;
        }
        return result;
    }
}
