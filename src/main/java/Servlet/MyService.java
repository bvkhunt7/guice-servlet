package Servlet;

import com.google.inject.ImplementedBy;

@ImplementedBy(MyServiceImpl.class)
public interface MyService {

	
	String doStuff();

}
