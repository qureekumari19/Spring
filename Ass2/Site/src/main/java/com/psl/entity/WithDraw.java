package com.psl.entity;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.springframework.lang.NonNull;

public class WithDraw {    
	private int accno;   
	@Override
	public String toString() {
		return "Cash Remain[accno=" + accno + ", amount=" + amount + "]";
	}
	public WithDraw() {		
	}
	public WithDraw(int accno, int amount) {		
		this.accno = accno;
		this.amount = amount;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	private int amount=0;
	
}
