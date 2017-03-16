package com.jose.q3.shapes;

import java.util.UUID;

public class Square {
	
	private UUID id; //Id that will be generated with UUID
	
	private Float cordX;
	private Float cordY;
	private Float sideLengh;
	
	public Square(final UUID id, final Float cordX, final Float cordY, final Float sideLengh) {
		this.id = id;
		this.cordX = cordX;
		this.cordY = cordY;
		this.sideLengh = sideLengh;
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
	public Float getSideLengh() {
		return sideLengh;
	}
	public void setSideLengh(Float sideLengh) {
		this.sideLengh = sideLengh;
	}
	
	
	

}
