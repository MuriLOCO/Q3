package com.jose.q3.utilities;

import com.jose.q3.enumerators.OptionEnum;

public class Selection {
	
	private String shape;
	private Float[] coordinates;
	private boolean error;
	private OptionEnum option = OptionEnum.NOTHING;
	
	
	public Selection(final String shape, final Float[] coordinates) {
		this.shape = shape;
		this.coordinates = coordinates;
	}
	
	public Selection(final boolean error) {
		this.error = error;
	}	
	
	public Selection(final OptionEnum option) {
		this.option = option;
	}
	
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public Float[] getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Float[] coordinates) {
		this.coordinates = coordinates;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public OptionEnum getOption() {
		return option;
	}
	public void setOption(OptionEnum option) {
		this.option = option;
	}
	
	
	

}
