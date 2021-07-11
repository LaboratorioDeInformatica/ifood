package br.com.fiap.purchase.sell.dto;

public class BuyerDto {

	String email;
	Double summation;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Double getSummation() {
		return summation;
	}
	public void setSummation(Double summation) {
		this.summation = summation;
	}
	
	public BuyerDto(String email, Double summation) {
		super();
		this.email = email;
		this.summation = summation;
	}
	
	
	
}
