package com.pojo;

import java.io.Serializable;

public class Address implements Serializable {
	private String cityname,state;
	public int pin_code;
	public Address()
	{
		
	}
	public Address(String cityname,int pin_code,String state)
	{
		super();
		this.cityname=cityname;
		this.pin_code=pin_code;
		this.state=state;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getPin_code() {
		return pin_code;
	}
	public void setPin_code(int pin_code) {
		this.pin_code = pin_code;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cityname+"\t|"+state+"\t"+pin_code;
	}

}
