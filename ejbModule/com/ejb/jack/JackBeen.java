package com.ejb.jack;

import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class JackBeen
 */
@Stateless
@Remote({JackBeenRemote.class})
public class JackBeen implements JackBeenRemote {

    /**
     * Default constructor. 
     */
    public JackBeen() {
        System.out.println("JackBeen");
    }
    public String SayHello(String Name){
    	
    	return "Hello" +" " +Name +" "+ "nice to meet you !";
    }

}
