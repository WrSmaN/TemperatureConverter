/**
 * @author Wade - wrshafer3
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
package model;

public class TempConverterF {
	
	private double temp;

	
	public TempConverterF() {
		super();
	}

	public TempConverterF(double temp) {
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
		
		temperature = ((temp - 32)* 5) / 9;
		
		setTemp(temperature);
	}
	
	
	
	
}
