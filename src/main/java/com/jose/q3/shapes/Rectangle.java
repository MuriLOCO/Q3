package com.jose.q3.shapes;

import java.util.UUID;

public class Rectangle {
	
	private UUID id; //Id that will be generated with UUID
	
	private Float cordX;
	private Float cordY;
	private Float side1;
	private Float side2;
	
	public Rectangle(final UUID id, final Float cordX, final Float cordY, final Float side1, final Float side2) {
		this.id = id;
		this.cordX = cordX;
		this.cordY = cordY;
		this.side1 = side1;
		this.side2 = side2;		
	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public Float getCordX() {
		return cordX;
	}
	public void setCordX(Float cordX) {
		this.cordX = cordX;
	}
	public Float getCordY() {
		return cordY;
	}
	public void setCordY(Float cordY) {
		this.cordY = cordY;
	}
	public Float getSide1() {
		return side1;
	}
	public void setSide1(Float side1) {
		this.side1 = side1;
	}
	public Float getSide2() {
		return side2;
	}
	public void setSide2(Float side2) {
		this.side2 = side2;
	}
	
	

}
