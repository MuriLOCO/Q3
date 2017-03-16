package com.jose.q3.shapes;

import java.util.UUID;

public class Donut {

private UUID id; //Id that will be generated with UUID
	
	private Float cordX;
	private Float cordY;
	private Float radius1;
	private Float cordA;
	private Float cordB;
	private Float radius2;
	
	public Donut(final UUID id, final Float cordX, final Float cordY, final Float radius1, final Float cordA, final Float cordB, final Float radius2) {
		this.id = id;
		this.cordX = cordX;
		this.cordY = cordY;
		this.radius1 = radius1;
		this.cordA = cordA;
		this.cordB = cordB;
		this.radius2 = radius2;
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
	public Float getRadius1() {
		return radius1;
	}
	public void setRadius1(Float radius1) {
		this.radius1 = radius1;
	}
	public Float getCordA() {
		return cordA;
	}
	public void setCordA(Float cordA) {
		this.cordA = cordA;
	}
	public Float getCordB() {
		return cordB;
	}
	public void setCordB(Float cordB) {
		this.cordB = cordB;
	}
	public Float getRadius2() {
		return radius2;
	}
	public void setRadius2(Float radius2) {
		this.radius2 = radius2;
	}
	
	
	
}
