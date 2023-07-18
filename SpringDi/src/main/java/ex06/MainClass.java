package ex06;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("ex06-context.xml");
		
		Airplane ap = ctx.getBean(Airplane.class);
		Car car = ctx.getBean(Car.class);
		
		car.getBattery().energy();
		ap.getBattery().energy();
		
	}
}
