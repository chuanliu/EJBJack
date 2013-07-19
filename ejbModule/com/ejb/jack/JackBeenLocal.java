package com.ejb.jack;

import javax.ejb.Local;

@Local
public interface JackBeenLocal {
	String SayHelloLocal(String Name);
}
