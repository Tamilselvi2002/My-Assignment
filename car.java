package week1.day1;

import cucumber.api.cli.Main;

public class car {
	public  void ApplyGear() {
		System.out.println("applygear");
	}
public void SwitchOnAc() {
	System.out.println("switch onac");
}
	public void applyAcclerate() {
		System.out.println("apply acclerate");
	}
	public static void main(String[] args) {
		car audi=new car();
		audi.ApplyGear();
		audi.SwitchOnAc();
		audi.applyAcclerate();
	}
	
}
