package br.com.gft.cursojava.excecoes.model.entities;

import br.com.gft.cursojava.excecoes.model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public Double deposit (Double amount) {
		return balance += amount;
	}	
	
	public Double withdraw (Double amount) {
		if (withdrawLimit < amount) {
			throw new DomainException("The amount exceeds withdraw limit");
		} if (balance < amount) {
			throw new DomainException("Not enough balance");
		} 	
		return balance -= amount;
	}	
}