package in.codeArea.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args)
	{
		
		@SuppressWarnings("resource")
		  ApplicationContext ctx = new ClassPathXmlApplicationContext( "spring-Bean.xml" );
	}

}
