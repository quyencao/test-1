package models;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Test implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int n = 10;
	private String name = "test";
	private int[] numbers = {1,2,3};
	private String[] strings = {"A", "B", "C"};
	private String contract = "c1";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	public String doAction() {
		return "index";
	}

	public String[] getStrings() {
		return strings;
	}

	public void setStrings(String[] strings) {
		this.strings = strings;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}
	
	public String changeContract(String c) {
		this.contract = c;
		
		return "page1";
	}
}
