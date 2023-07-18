package ex06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Airplane {

	//batter2 주입해주세요

	private IBattery battery;
	
	//기본생성자
	public Airplane() {}
	
	public Airplane(IBattery battery) {
		this.battery = battery;
	}
	
	public IBattery getBattery() {
		return battery;
	}

	public void setBattery(IBattery battery) {
		this.battery = battery;
	}
	
	
	
}
