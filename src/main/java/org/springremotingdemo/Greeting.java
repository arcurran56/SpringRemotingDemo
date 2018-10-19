/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springremotingdemo;

import java.io.Serializable;
import org.springframework.stereotype.Component;

/**
 *
 * @author Alan
 */
public class Greeting implements Serializable{

    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}  
