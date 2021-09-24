/**
 * @author Wade - wrshafer3
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
package model;

public class TempConverterC {
	
	private double temp;

	
	public TempConverterC() {
		super();
	}

	public TempConverterC(double temp) {
		super();
		this.temp = temp;
		setTemperature(temp);
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public void setTemperature(double temp) {
		double temperature;
		
		temperature = ((9.0 / 5.0) * temp) + 32;
		
		setTemp(temperature);
	}
}
